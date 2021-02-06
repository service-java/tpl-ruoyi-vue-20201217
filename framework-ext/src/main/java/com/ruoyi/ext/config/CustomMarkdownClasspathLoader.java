package com.ruoyi.ext.config;

import cn.hutool.core.date.StopWatch;
import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.kit.MDParser;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class CustomMarkdownClasspathLoader implements SQLLoader {


    // @todo 改成数组形式或者判断逗号连接有点麻烦
    protected String sqlRoot;
    protected String lineSeparator;
    protected Map<String, SQLSource> sqlSourceMap;
    protected DBStyle dbs;
    protected boolean autoCheck;
    protected String charset;
    protected SQLIdNameConversion sqlIdNameConversion;
    protected SQLSource NO_EXIST;
    protected ClassLoader classLoader;
    protected SQLManager sqlManager;

    public CustomMarkdownClasspathLoader() {
        this("/sql");
    }

    public CustomMarkdownClasspathLoader(String root) {
        this(root, new MySqlStyle());
    }

    public CustomMarkdownClasspathLoader(String root, DBStyle dbs) {
//        log.info("beetsql-root {}", root);
        this.sqlRoot = null;
        this.lineSeparator = System.getProperty("line.separator", "\n");
        this.sqlSourceMap = new ConcurrentHashMap();
        this.dbs = null;
        this.autoCheck = true;
        this.charset = null;
        this.sqlIdNameConversion = new DefaultSQLIdNameConversion();
        this.NO_EXIST = new SQLSource();
        this.classLoader = null;
        this.sqlManager = null;
        this.sqlRoot = root;
        this.dbs = dbs;
    }

    public SQLSource getSQL(String id) {
        log.info("获取SQL ~~");
        StopWatch watch = new StopWatch();
        watch.start();
        SQLSource ss = this.tryLoadSQL(id);
        watch.stop();
        log.info("用时 {}ms", watch.getTotalTimeMillis());
        return ss;
    }

    private SQLSource tryLoadSQL(String id) {
        log.info("尝试加载SQL ~~");

        SQLSource ss = (SQLSource) this.sqlSourceMap.get(id);
        boolean hasLoad = false;
        if (ss == null) {
            this.loadSql(id);
            hasLoad = true;
        }

        if (!hasLoad && this.autoCheck && this.isModified(id)) {
            this.loadSql(id);
        }

        ss = (SQLSource) this.sqlSourceMap.get(id);
        if (ss == null) {
            this.sqlSourceMap.put(id, this.NO_EXIST);
            return null;
        } else {
            return ss == this.NO_EXIST ? null : ss;
        }
    }

    public boolean isModified(String id) {
        log.info("判断是否改变 ~~");
        SQLSource source = (SQLSource) this.sqlSourceMap.get(id);
        if (source != null && source instanceof SQLTableSource && source == this.NO_EXIST) {
            return false;
        } else {
            long oldRootVersion = source.getVersion().root;
//            long oldDbVersion = source.getVersion().db;
            URL root = this.getRootFile(id);
            log.info("改变了吗? {}", getURLVersion(root) != oldRootVersion);
//            URL db = this.getDBRootFile(id);
//            return getURLVersion(root) != oldRootVersion || getURLVersion(db) != oldDbVersion;
            return getURLVersion(root) != oldRootVersion;
        }
    }

    protected static Long getURLVersion(URL url) {
        if (url == null) {
            return 0L;
        } else if (url.getProtocol().equals("file")) {
            String path = url.getFile();
            return (new File(path)).lastModified();
        } else {
            return 0L;
        }
    }

    public boolean exist(String id) {
         log.info("是否存在");
        return this.tryLoadSQL(id) != null;
    }

    public void addSQL(String id, SQLSource source) {
        this.sqlSourceMap.put(id, source);
    }

    private boolean loadSql(String id) {
        URL ins = this.getRootFile(id);
        boolean rootResult = this.readSqlFile(id, ins, true);
//        ins = this.getDBRootFile(id);
//        boolean dbResult = this.readSqlFile(id, ins, false);
//        return rootResult || dbResult;
        return rootResult;
    }

    private boolean readSqlFile(String id, URL url, boolean isRoot) {
        if (url == null) {
            return false;
        } else {
            InputStream ins;
            try {
                ins = url.openStream();
            } catch (IOException var23) {
                return false;
            }

            String modelName = id.substring(0, id.lastIndexOf(".") + 1);
            if (ins == null) {
                return false;
            } else {
                this.sqlIdNameConversion.getPath(id);
                long lastModified = getURLVersion(url);
                new LinkedList();
                BufferedReader bf = null;

                try {
                    bf = new BufferedReader(new InputStreamReader(ins, this.charset));
                    MDParser parser = new MDParser(modelName, bf);
                    SQLSource source = null;

                    while ((source = parser.next()) != null) {
                        org.beetl.sql.core.ClasspathLoader.SQLFileVersion version = new org.beetl.sql.core.ClasspathLoader.SQLFileVersion();
                        version.url = url;
                        if (isRoot) {
                            version.root = lastModified;
                        } else {
                            version.db = lastModified;
                        }

                        source.setVersion(version);
                        this.sqlSourceMap.put(source.getId(), source);
                    }
                } catch (IOException var24) {
                    var24.printStackTrace();
                } finally {
                    if (bf != null) {
                        try {
                            bf.close();
                        } catch (IOException var22) {
                            var22.printStackTrace();
                        }
                    }

                }

                return true;
            }
        }
    }

    public Map<String, SQLSource> getSqlSourceMap() {
        return this.sqlSourceMap;
    }

    public String getSqlRoot() {
        return this.sqlRoot;
    }

    public void setSqlRoot(String sqlRoot) {
        this.sqlRoot = sqlRoot;
    }

    private URL getFile(String id, String prefixPath) {
        String path = this.sqlIdNameConversion.getPath(id);
        String mapperLocation = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + sqlRoot;
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();

//        log.info("sqlRoot {} ==>", sqlRoot);
//        log.info("prefixPath {} ==>", prefixPath);
//        log.info("mapperLocation {} ==>", mapperLocation);
        try {
            Resource[] mappers = resourceResolver.getResources(mapperLocation);
//            log.info("匹配到{}个路径", mappers.length);
            InputStream ins = null;
            URL is = null;
            for (Resource mapper : mappers) {
                log.info("md位置路径 {} ==>", mapper.getURL() + prefixPath + path);
                String filePath0 = mapper.getURL() + prefixPath + path + ".md";
                is = new URL(filePath0);

                boolean exists = FileUtil.file(is).exists();
                if (exists) {
                    log.info("md找到了");
                    break;
                }

             /*   try {
                    // 校验地址能否打开
                    ins = is.openStream();
                    if (ins != null) {
                        // 再试试其他路径
                        log.info("md找到了");
                        break;
                    }
                } catch (IOException var23) {

                    if (ins == null) {
                        // 再试试其他路径
                        continue;
                    }

                } finally {
                   *//* if (ins != null) {
                        ins.close();
                        break;
                    }*//*
                }*/

            }

            log.info("啥, 找找了?");
            // 最后需要返回这个URL
            return is;

        } catch (IOException e) {
            // ignore
        }

        return null;
    }

    private URL getRootFile(String id) {
        return this.getFile(id, "");
    }

    private URL getDBRootFile(String id) {
        return this.getFile(id, this.dbs.getName() + "/");
    }

    public boolean exsitResource(String id) {
//        return this.getRootFile(id) != null || this.getDBRootFile(id) != null;
        return this.getRootFile(id) != null;
    }


    public boolean isAutoCheck() {
        return this.autoCheck;
    }

    public void setAutoCheck(boolean check) {
        this.autoCheck = check;
    }

    public DBStyle getDbs() {
        return this.dbs;
    }

    public void setDbs(DBStyle dbs) {
        this.dbs = dbs;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String toString() {
        return this.sqlRoot;
    }

    public void setSQLIdNameConversion(SQLIdNameConversion sqlIdNc) {
        this.sqlIdNameConversion = sqlIdNc;
    }

    public void setDbStyle(DBStyle dbStyle) {
        this.dbs = dbStyle;
    }

    public void setSQLManager(SQLManager sqlManager) {
        this.sqlManager = sqlManager;
    }

    public SQLManager getSQLManager() {
        return this.sqlManager;
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void refresh() {
        this.sqlSourceMap = new ConcurrentHashMap();
    }

    public static class SQLFileVersion {
        public URL url;
        public long root = 0L;
        public long db = 0L;

        public SQLFileVersion() {
        }

        public boolean isModified(org.beetl.sql.core.ClasspathLoader.SQLFileVersion newVersion) {
            return newVersion.root != this.root || newVersion.db != this.db;
        }
    }
}

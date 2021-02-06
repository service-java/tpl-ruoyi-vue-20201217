package com.ruoyi.ext.config;


import com.ruoyi.ext.database.UuidAutoGen;
import com.ruoyi.ext.util.BeetlsqlNameConversion;
import lombok.extern.slf4j.Slf4j;
import org.beetl.core.Function;
import org.beetl.sql.core.IDAutoGen;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.engine.IsBlank;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.BeetlSqlScannerConfigurer;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


@Configuration
@Slf4j
public class BeetlsqlDataSourceConfig {


    @Bean(name = "baseDataSource")
    public DataSource datasource(Environment env) {
        String url = env.getProperty("spring.datasource.url");
        String userName = env.getProperty("spring.datasource.username");
        String password = env.getProperty("spring.datasource.password");
        return DataSourceBuilder.create().url(url).username(userName).password(password).build();
    }

    @Bean(name = "beetlSqlScannerConfigurer")
    public BeetlSqlScannerConfigurer getBeetlSqlScannerConfigurer() {
        BeetlSqlScannerConfigurer conf = new BeetlSqlScannerConfigurer();
        conf.setBasePackage("com.ruoyi.**.mapper");
        conf.setDaoSuffix("Mapper");
        conf.setSqlManagerFactoryBeanName("sqlManagerFactoryBean");
        return conf;
    }

    @Bean(name = "sqlManagerFactoryBean")
    // @Primary
    public SqlManagerFactoryBean getSqlManagerFactoryBean(ConfigurableApplicationContext context, @Autowired DataSource datasource) {
        SqlManagerFactoryBean factory = new SqlManagerFactoryBean();

        BeetlSqlDataSource source = new BeetlSqlDataSource();
        source.setMasterSource(datasource);
        boolean debug = context.getEnvironment().acceptsProfiles(Profiles.of("dev"));
        Properties prop = new Properties();
        prop.setProperty("PRODUCT_MODE", "" + (!debug));
        factory.setExtProperties(prop);
        factory.setCs(source);


        Map<String, Function> functions = new HashMap<>();
        functions.put("isBlank", new IsBlank());
        factory.setFunctions(functions);


        factory.setDbStyle(new MySqlStyle());
        factory.setNc(new BeetlsqlNameConversion());


        // 输出sql的debug日志 @nice
        if (debug) {
            Interceptor interceptor = new DebugInterceptor();
            factory.setInterceptors(new Interceptor[]{interceptor});
        }

        Map<String, IDAutoGen> idAutoGens = new HashMap<String, IDAutoGen>();
        idAutoGens.put("uuid", new UuidAutoGen());
        factory.setIdAutoGens(idAutoGens);

        // @todo md文件的全路径扫描加载功能, 但改成数组或逗号连接还是有点麻烦
        // 现在还出现了getSQL()执行两遍的情况, 整个人抓狂, 也无精力升级到v3.x.x接着玩了
        // https://gitee.com/xiandafu/beetlsql/issues/IKEVZ
//         factory.setSqlLoader(new ClasspathLoader("/sql"));
        factory.setSqlLoader(new CustomMarkdownClasspathLoader("/com/ruoyi/**/mapper/mapping"));

        return factory;
    }

}


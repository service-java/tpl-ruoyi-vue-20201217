# README

- 在[ruoyi-vue](https://gitee.com/y_project/RuoYi-Vue)基础上修改如下

```
1) 去掉部分Ruoyi标志, 方便快速替换成企业标志 
2) 目录层级适度调整 @eg 非项目目录用下划线开头 + 业务包开始数最多两层
3) 依赖调整为 common --> framework-xxx --> module-xxx --> service-xxx --> ui-xxx 的单向顺序
4) 给ResultVo扩展几个快速方法, 稍微灵活些

===
5) _bin/xxx.sh文件 gbk转为utf-8
6) 外部域名统一成example.com, 使用switchhost映射真实IP
7) 数据库表前缀决定模块名称 @eg sys, oss ==> sql放在对应模块下
8) 开发热部署 --> springboot-devtools的重启方式好像不太合拍, 目前JRebel+RUN模式+log.info()
```

# 代办列表

- Redis未开启时的报错处理 @todo
- 去掉BaseController与BaseEntity部分内容, 因为JSON数量大时很浪费带宽 @todo

```
BaseController --> initBinder
BaseEntity --> params + GMTDate + OpUser
```

- Crawler模块 (beetlsql + webmagic + OpenFeign) @building
    - feign不放在SpringCloud里单独用很不顺手, 这时候感觉Hutool的HttpUtil比较趁手
    - http://localhost:8099/swagger-ui.html
    - http://localhost:8099/beetlsql/demo
    - http://localhost:8099/beetlsql/countDept
    - http://localhost:8099/beetlsql/countDict
    - http://localhost:8099/beetlsql/listMenu
    - http://localhost:8099/beetlsql/checkEmailUnique

- OSS模块 (shiro + mybatis-plus + cqengine + easyexcel) @building
    - RefreshToken的操作 @todo
    - IDEA的MybatisCodeHelperPro($)/EasyCode插件可以支持(大部分)代码的自动生成
    - IDEA的JRebel-MybatisPlus插件可以支持xml改动时触发热更新
    - http://localhost:8100/swagger-ui.html
    - http://localhost:8100/oss/listDemo --> 因为配了个不存在的权限, 登录后访问会返回权限不足
    - http://localhost:8100/oss/list
    - http://localhost:8110/oss/page?isAsc=false&orderByColumn=name&pageNum=1&pageSize=3
    - http://localhost:8110/oss/pageByXml?isAsc=false&orderByColumn=name&pageNum=1&pageSize=3

- Blog模块 @todo
    - 在OSS模块基础上加点东西
    - 分享内容卡片
    - 所以命名是service-oss-blog(依赖module-oss+module-oss-blog)
    - http://localhost:8110/swagger-ui.html

- DataV模块 @todo
    - 在OSS模块基础上加点东西
    - 统计材料特征
    - http://localhost:8112/swagger-ui.html

- Exam模块 (WebSocket) @todo 
    - 类似冲顶大会, 题目是服务端推送过去的
    - 在OSS模块基础上加点东西

- Mall模块 (EasyRules) @todo
    - 在OSS模块基础上加点东西

- Game模块 (JCTools) @todo           
- Book模块 (App向 + OkHttp + Token验证??) @todo


# 常见问题 @faq

- service-xxx新模块里引入swaggerConfig等配置的注入, 取值会报错 @fix --> Application放到com/ruoyi才能保证扫描到...还是太嫩了 
- JSON序列化时存取失败 --> 如果调整过实体所在的目录结构, _class信息已过时，则需要清空Redis相关数据重启
- 在idea内新增或调整module之后typeAlias一直诡异报错 --> 删除./idea后重启就好了(或者顺便mvn clean)
- BeetlSql没有在 '[com]' 包中找到任何Mapper，请检查配置 @ignore --> 暂时只是提示不影响实际运行
- 怎么把beetlsql的markdown文件放到com/ruoyi/**/mapper下也能找到并生效
   
```
1) 拷贝源码里的ClasspathLoader, 重写一个MarkdownClasspathLoader, 
最后在factory.setSqlLoader()里配置一番

2) com/ruoyi/** 下的静态文件不太确定构建时是否会自动拷贝
如果没有的话, markdown文件所在的子模块pom.xml里还得加一下

<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <filtering>true</filtering>
        </resource>
        <!-- sql资源的位置 -->
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.sql</include>
                <include>**/*.md</include>
            </includes>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```    

- BeetlSQL里的日期格式化 @fix --> 这个算直觉上的小坑
    - SQL里需要DATE_FORMAT一下, 这个与SQL是一致的, 比较合理
    - lambdaQuery里直接传入Date()格式是没有任何报错提示的, 就要自己注意了!!
    - https://www.oschina.net/question/204344_2218080
    - https://www.oschina.net/question/204344_2219153

```sql
select 
    u.user_id, u.dept_id, u.user_name, u.email, u.avatar, 
    u.phonenumber, u.password, u.sex, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_by, u.create_time, 
    u.remark, 
    d.dept_name
from sys_user u 
left join sys_dept d on u.dept_id = d.dept_id 
where u.del_flag = '0'
@if(!isEmpty(createTime)){
    and  u.create_time <= DATE_FORMAT(#createTime#, '%Y-%m-%d')
@}
@if(!isEmpty(deptId)){
    AND u.dept_id = #deptId# 
@}
```

```java
List<SysDept> list2 = sysDeptMapper.createLambdaQuery()
    // @fix 日期的诡异之处, 需要把值转换成字符串类型
    .andLess(SysDept::getCreateTime, DateUtil.parse("2020-12-01").toString("yyyy-MM-dd"))
    .andEq(SysDept::getDelFlag, 0)
    .select();
```

- MyBatis-Plus的Could not set property ‘id‘ of xxx @fix
    - 配置一下主建生成规则??
    - https://blog.csdn.net/qq_27632921/article/details/109743382

- Mybatis-Plus怎么分页查询??
    - 单表查询 this.page()
    - XML自定义分页查询 --> 传入IPage参数

```java
@Service
public class OssBucketService extends ServiceImpl<OssBucketMapper, OssBucket> {
    public PageDataVo page(PageQuery pageQuery, OssBucket ossBucket) {
        IPage<OssBucket> page = this.page(
            // 分页参数, PageQueryUtils提供简单封装和一定的防SQL注入功能
            new PageQueryUtils<OssBucket>().convertIPage(pageQuery),
            // 查询参数
            new QueryWrapper<OssBucket>()
                .like(StringUtils.isNotBlank(ossBucket.getName()),"name", ossBucket.getName())
                .eq(ossBucket.getId() != null,"id", ossBucket.getId())
        );
        return new PageDataVo(page);
    }
}
```

```java
@RestController
public class OssController {
    @GetMapping("/pageByXml")
    public ResultVo pageByXml(PageQuery pageQuery, OssBucket ossBucket) {
        Page<OssBucket> ossBucketIPage = ossBucketMapper.pageByXML(
                new PageQueryUtils<OssBucket>().convertIPage(pageQuery),
                ossBucket);
        return ResultVo.success(new PageDataVo(ossBucketIPage));
    }
}
```

```java
@Mapper
public interface OssBucketMapper extends BaseMapper<OssBucket> {
    // 分页IPage参数 + 其他查询参数
    IPage<OssBucket> pageByXML(IPage<OssBucket> pageQuery, @Param("ossBucket") OssBucket ossBucket);
}
```

```xml
<select id="pageByXML" resultType="com.ruoyi.oss.domain.OssBucket">
    select *
    from oss_bucket
    <where>
        <trim>
            <if test="ossBucket.name != null and ossBucket.name != ''">
                and `name` like #{ossBucket.name}"%"
            </if>
        </trim>
    </where>
</select>
```

- 怎么在spring中使用 feign，解决上传文件的痛点
    - https://blog.csdn.net/sinat_27639721/article/details/81218357

- Feign get接口传输对象引发一场追寻 @todo
    - 目前GET方法设计时尽量保持参数简单
    - 直接传对象貌似还会 --> Request method 'POST' not supported
    - https://www.cnblogs.com/killbug/p/9776287.html

- How to convert a multipart file to File?
    - https://stackoverflow.com/questions/24339990/how-to-convert-a-multipart-file-to-file
    - https://segmentfault.com/q/1010000011629098
    
# 参考

- ruoyi-vue
    - https://gitee.com/y_project/RuoYi-Vue

- renren-fast
    - https://gitee.com/renrenio/renren-fast

- ruoyi-plus 
    - https://gitee.com/markbro/ruoyi-plus

- ruoyi-beetlsql
    - https://gitee.com/iehyou/ruoyi-beetlsql

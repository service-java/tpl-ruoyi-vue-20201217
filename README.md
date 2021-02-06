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

===
// framework-sys
ruoyi-vue的底子
后台功能比较完善
几乎都是原始技术，比较纯粹，不用担心别人不会其中某个框架

// framework-cms/mall
renren-fast的底子
集成了一些流行框架(mybatis-plus), 适合快速开发

// framework-ext @minor @ignore
天下苦xml久矣
beetl(js-like)语法 ==> beetlsql能直接在markdown里写sql 
但因为非主流, 目前主要用在需要大量联表查询统计的个人系统(最好不涉及增删改)
```

# 代办列表

->>

# 常见问题 @faq

->>
     
# 参考

- ruoyi-vue
    - 目前最钟意的模块拆分方法
    - https://gitee.com/y_project/RuoYi-Vue

- mall-learning @nice
    - 入门学习
    - https://github.com/macrozheng/mall-learning

- litemall @todo
    - https://github.com/linlinjava/litemall

- renren-fast
    - 单模块快速开发, 适合用来做外包
    - https://gitee.com/renrenio/renren-fast

- jeecg-boot @todo
    - https://gitee.com/jeecg/jeecg-boot

- ruoyi-plus @todo
    - 集成了很多扩展功能, 值得参考
    - https://gitee.com/markbro/ruoyi-plus

- ruoyi-beetlsql @old
    - 单模块结构, 作者貌似不维护了
    - https://gitee.com/iehyou/ruoyi-beetlsql

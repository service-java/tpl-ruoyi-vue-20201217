# README

# 修改调整

- 在[ruoyi-vue](https://gitee.com/y_project/RuoYi-Vue)基础上修改如下

```
1) 去掉部分Ruoyi标志, 方便快速替换成企业标志 
2) 目录层级适度调整 @eg 非项目目录用下划线开头 + 业务包开始数最多两层
3) 给ResultVo扩展几个快速方法, 稍微灵活些

===
4) _bin/xxx.sh文件 gbk转为utf-8 @ignore
5) 外部域名统一成example.com, 使用switchhost映射真实IP
6) 开发热部署 --> springboot-devtools的重启方式好像不太合拍, 目前使用JRebel+RUN模式+log.info()
```

# 结构说明

```
依赖调整为目录名恰好从上到下的单向顺序 
--> common 
--> framework-xxx 
--> module-xxx 
--> service-xxx 
--> ui-xxx 

===
// common
共用模块(工具类+基础配置)
不是必要的代码不要下沉
尽量不要污染这个模块

sys相关代码转移 @todo

之前想过叫core
不过core这个单词表意不明

===
// framework
各种框架的配置等
为了复用, 尽量不要涉及业务的增删改查实际代码
安全模块要涉及到的用户查询, 仅调用接口, 到module才真正实现

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

===
// module
模块名称由数据库表前缀(最好3-5个字母)决定 
@eg sys, oss ==> sql建表语句放在对应模块下

===
// service
可以打包运行的模块
组合复用上述模块

===
// ui
前端界面
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

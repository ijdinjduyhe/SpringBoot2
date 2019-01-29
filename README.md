# yige-test
### “一个”论坛项目的代码测试环节

### Dubbo 
- 简介：dubbo 分布式开发框架
- 使用：整合SpringBoot官方教程：[Dubbo-SpringBoot](https://github.com/alibaba/dubbo-spring-boot-starter)
- 问题：
  - springboot整合dubbo中的maven依赖中没有 [zkclient](https://blog.csdn.net/t1dmzks/article/details/78440717) 依赖。
会报一个加载 init() 方法失败的错误 __Invocation of init method failed; nested exception is java.lang.NoClassDefFoundError: org/apache/zookeeper/Watcher$Event$KeeperState__ 。

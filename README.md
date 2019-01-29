# yige-test
### “一个”论坛项目的代码测试环节

### Dubbo 
- 简介：dubbo 分布式开发框架
- 使用：整合SpringBoot官方教程：[Dubbo-SpringBoot](https://github.com/alibaba/dubbo-spring-boot-starter)
- 问题：
-   报错  | 解决方案| 具体方法
      --------- | --------| --------|
        init() 初始化失败  | dubbo-springdubbo依赖中不自带zkclient依赖。需要手动添加 | (CTRL+F搜索)[zkclient依赖]()|
      同一台电脑上模拟两个提供者时会报端口占用 | 将两个不同的提供者设置不同的端口 | (CTRL+F搜索)[dubbo端口占用]() |


________
附页：

- zkclient依赖
```xml
<dependency>
    <groupId>com.github.sgroschupf</groupId>
    <artifactId>zkclient</artifactId>
    <version>0.1</version>
</dependency>
```
- dubbo端口占用
```properties 
# 在SpringBoot配置文件中将 DUBBO 的默认(20880)端口修改一下。保证每个提供者的端口号都不一样就行。
spring.dubbo.protocol.name=dubbo
spring.dubbo.protocol.port=20881
```
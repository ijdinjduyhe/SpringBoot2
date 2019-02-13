package com.annie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EditorController {


    @RequestMapping("/index")
    public String index() {


        return "editor";
    }

    @RequestMapping("/show")
    public String show(Model model) {
        String str = "工具：\n" +
                "- idea2018.2.4\n" +
                "- maven3.5.4\n" +
                "- jdk1.8.0\n" +
                "- mysql5.7\n" +
                "\n" +
                "版本：\n" +
                "- springboot 2.1.2\n" +
                "- springboot-mybatis 2.0.0\n" +
                "- mysql 5.1.8\n" +
                "- druid 1.1.10\n" +
                "- pagehelper 1.2.5\n" +
                "- generator 1.3.2\n" +
                "\n" +
                "### 创建springboot-2.1.2项目（引入 web mysql mybatis 模块）![](https://upload-images.jianshu.io/upload_images/15166130-03ba990698fede13.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "\n" +
                "### 创建数据库（mysql 5.7 , mysql 5.7 , mysql 5.7）\n" +
                "```sql\n" +
                "CREATE DATABASE yige DEFAULT CHARSET utf8 COLLATE utf8_general_ci;\n" +
                "use\n" +
                "yige;\n" +
                "\n" +
                "/* 用户信息表 */\n" +
                "CREATE TABLE USER (\n" +
                "    u_id int NOT NULL auto_increment COMMENT  '用户ID',\n" +
                "    u_user char(20) not null COMMENT  '用户账号',\n" +
                "\tu_password char(20) not null COMMENT '用户密码',\n" +
                "\tu_email char(30) not null COMMENT '用户邮箱',\n" +
                "\tu_phone char(11) COMMENT '用户手机号',\n" +
                "\tu_name char(11)  COMMENT '用户真实姓名',\n" +
                "\tu_createtime TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP COMMENT '用户创建时间',\n" +
                "\tu_headurl char(100)  COMMENT '用户头像URL',\n" +
                "\tu_status int not null DEFAULT 0 COMMENT '用户的状态码： 0 未验证  1 验证成功可以登录',\n" +
                "    PRIMARY KEY  (`u_id`)\n" +
                ")COMMENT ='用户表' ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;\n" +
                "\n" +
                "\n" +
                "/* 用户表的模拟数据 */\n" +
                "insert into USER(u_user,u_password,u_email,u_phone,u_name,u_headurl) values \n" +
                "\t('zhangsan','111','131@qq.com','1503760855','张三','http://www.yige.com'),\n" +
                "\t('lishui','111','131@qq.com','1503760855','李四','http://www.yige.com'),\n" +
                "\t('wangwu','111','131@qq.com','1503760855','王五','http://www.yige.com'),\n" +
                "\t('zhaoliu','111','131@qq.com','1503760855','赵六','http://www.yige.com'),\n" +
                "\t('1','1','131@qq.com','1503760855','1','http://www.yige.com');\n" +
                "\n" +
                "```\n" +
                "\n" +
                "###  pom.xml\n" +
                "```xml\n" +
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "    <modelVersion>4.0.0</modelVersion>\n" +
                "    <parent>\n" +
                "        <groupId>org.springframework.boot</groupId>\n" +
                "        <artifactId>spring-boot-starter-parent</artifactId>\n" +
                "        <version>2.1.2.RELEASE</version>\n" +
                "        <relativePath/> <!-- lookup parent from repository -->\n" +
                "    </parent>\n" +
                "    <groupId>com.annie.test</groupId>\n" +
                "    <artifactId>mybatis</artifactId>\n" +
                "    <version>0.0.1-SNAPSHOT</version>\n" +
                "    <name>mybatis</name>\n" +
                "    <description>Demo project for Spring Boot</description>\n" +
                "\n" +
                "    <properties>\n" +
                "        <java.version>1.8</java.version>\n" +
                "    </properties>\n" +
                "\n" +
                "    <dependencies>\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-web</artifactId>\n" +
                "        </dependency>\n" +
                "        <dependency>\n" +
                "            <groupId>org.mybatis.spring.boot</groupId>\n" +
                "            <artifactId>mybatis-spring-boot-starter</artifactId>\n" +
                "            <version>2.0.0</version>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <dependency>\n" +
                "            <groupId>mysql</groupId>\n" +
                "            <artifactId>mysql-connector-java</artifactId>\n" +
                "            <scope>runtime</scope>\n" +
                "        </dependency>\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-test</artifactId>\n" +
                "            <scope>test</scope>\n" +
                "        </dependency>\n" +
                "\n" +
                "\n" +
                "\n" +
                "        <!-- 分页插件 -->\n" +
                "        <dependency>\n" +
                "            <groupId>com.github.pagehelper</groupId>\n" +
                "            <artifactId>pagehelper-spring-boot-starter</artifactId>\n" +
                "            <version>1.2.5</version>\n" +
                "        </dependency>\n" +
                "\n" +
                "\n" +
                "        <!-- alibaba的druid数据库连接池 -->\n" +
                "        <dependency>\n" +
                "            <groupId>com.alibaba</groupId>\n" +
                "            <artifactId>druid-spring-boot-starter</artifactId>\n" +
                "            <version>1.1.10</version>\n" +
                "        </dependency>\n" +
                "\n" +
                "    </dependencies>\n" +
                "\n" +
                "    <build>\n" +
                "        <plugins>\n" +
                "            <plugin>\n" +
                "                <groupId>org.springframework.boot</groupId>\n" +
                "                <artifactId>spring-boot-maven-plugin</artifactId>\n" +
                "            </plugin>\n" +
                "            <!-- mybatis generator 自动生成代码插件 -->\n" +
                "            <plugin>\n" +
                "                <groupId>org.mybatis.generator</groupId>\n" +
                "                <artifactId>mybatis-generator-maven-plugin</artifactId>\n" +
                "                <version>1.3.2</version>\n" +
                "                <configuration>\n" +
                "                    <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>\n" +
                "                    <overwrite>true</overwrite>\n" +
                "                    <verbose>true</verbose>\n" +
                "                </configuration>\n" +
                "            </plugin>\n" +
                "        </plugins>\n" +
                "    </build>\n" +
                "\n" +
                "</project>\n" +
                "\n" +
                "```\n" +
                "### 编写 generatorConfig.xml 文件：\n" +
                "![{A4C38016-3C3A-4955-B30D-A8E5759ACE30}.png.jpg](https://upload-images.jianshu.io/upload_images/15166130-a450d93d48d882ac.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "generatorConfig.xml ：\n" +
                "```xml\n" +
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE generatorConfiguration\n" +
                "        PUBLIC \"-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN\"\n" +
                "        \"http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd\">\n" +
                "<generatorConfiguration>\n" +
                "    <!-- 数据库驱动:选择你的本地硬盘上面的数据库驱动包-->\n" +
                "    <classPathEntry  location=\"C:\\Users\\13100\\.m2\\repository\\mysql\\mysql-connector-java\\5.1.8\\mysql-connector-java-5.1.8.jar\"/>\n" +
                "    <context id=\"DB2Tables\"  targetRuntime=\"MyBatis3\">\n" +
                "        <commentGenerator>\n" +
                "            <property name=\"suppressDate\" value=\"true\"/>\n" +
                "            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->\n" +
                "            <property name=\"suppressAllComments\" value=\"true\"/>\n" +
                "        </commentGenerator>\n" +
                "        <!--数据库链接URL，用户名、密码 -->\n" +
                "        <jdbcConnection driverClass=\"com.mysql.jdbc.Driver\" connectionURL=\"jdbc:mysql://127.0.0.1:3306/yige\" userId=\"root\" password=\"root\">\n" +
                "        </jdbcConnection>\n" +
                "        <javaTypeResolver>\n" +
                "            <property name=\"forceBigDecimals\" value=\"false\"/>\n" +
                "        </javaTypeResolver>\n" +
                "        <!-- 生成模型的包名和位置-->\n" +
                "        <javaModelGenerator targetPackage=\"com.annie.entity\" targetProject=\"src/main/java\">\n" +
                "            <property name=\"enableSubPackages\" value=\"true\"/>\n" +
                "            <property name=\"trimStrings\" value=\"true\"/>\n" +
                "        </javaModelGenerator>\n" +
                "        <!-- 生成映射文件的包名和位置-->\n" +
                "        <sqlMapGenerator targetPackage=\"mapping\" targetProject=\"src/main/resources\">\n" +
                "            <property name=\"enableSubPackages\" value=\"true\"/>\n" +
                "        </sqlMapGenerator>\n" +
                "        <!-- 生成DAO的包名和位置-->\n" +
                "        <javaClientGenerator type=\"XMLMAPPER\" targetPackage=\"com.annie.mapper\" targetProject=\"src/main/java\">\n" +
                "            <property name=\"enableSubPackages\" value=\"true\"/>\n" +
                "        </javaClientGenerator>\n" +
                "        <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->\n" +
                "        <table tableName=\"user\" schema=\"\"></table>\n" +
                "    </context>\n" +
                "</generatorConfiguration>\n" +
                "```\n" +
                "### 运行mybatis插件\n" +
                "![](https://upload-images.jianshu.io/upload_images/15166130-a4828957ed0c6711.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "\n" +
                "![](https://upload-images.jianshu.io/upload_images/15166130-d0773b71039b6c22.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "\n" +
                "![](https://upload-images.jianshu.io/upload_images/15166130-b3c08265506a742b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "\n" +
                "自动生成后的目录结构![](https://upload-images.jianshu.io/upload_images/15166130-3ce0d14adfe5f212.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)\n" +
                "\n" +
                "### Controller类（省略掉Service 为了方便）\n" +
                "```java\n" +
                "package com.annie.controller;\n" +
                "\n" +
                "import com.annie.entity.User;\n" +
                "import com.annie.mapper.UserMapper;\n" +
                "import com.annie.service.TestService;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.stereotype.Controller;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.ResponseBody;\n" +
                "\n" +
                "import java.util.List;\n" +
                "\n" +
                "@Controller\n" +
                "public class TestController {\n" +
                "\n" +
                "    @Autowired\n" +
                "    private UserMapper userMapper;\n" +
                "\n" +
                "\n" +
                "    @RequestMapping(\"/test\")\n" +
                "    @ResponseBody\n" +
                "    public List<User> getName(){\n" +
                "        List<User> user = userMapper.selectByExample(null);\n" +
                "        return user;\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "```\n" +
                "### 开启mapper的自动注入\n" +
                "```java\n" +
                "package com.annie;\n" +
                "\n" +
                "import org.mybatis.spring.annotation.MapperScan;\n" +
                "import org.springframework.boot.SpringApplication;\n" +
                "import org.springframework.boot.autoconfigure.SpringBootApplication;\n" +
                "\n" +
                "@SpringBootApplication\n" +
                "@MapperScan(\"com.annie.mapper\") // 自动注入\n" +
                "public class MybatisApplication {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        SpringApplication.run(MybatisApplication.class, args);\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "```\n" +
                "### 修改Controller，使用分页工具。\n" +
                "```java\n" +
                "package com.annie.controller;\n" +
                "\n" +
                "\n" +
                "import com.annie.entity.User;\n" +
                "import com.annie.mapper.UserMapper;\n" +
                "import com.annie.service.TestService;\n" +
                "import com.github.pagehelper.PageHelper;\n" +
                "import com.github.pagehelper.PageInfo;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.stereotype.Controller;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.ResponseBody;\n" +
                "\n" +
                "import java.util.List;\n" +
                "\n" +
                "@Controller\n" +
                "public class TestController {\n" +
                "\n" +
                "    @Autowired\n" +
                "    private UserMapper userMapper;\n" +
                "\n" +
                "\n" +
                "    @RequestMapping(\"/test\")\n" +
                "    @ResponseBody\n" +
                "    public List<User> getName() {\n" +
                "\n" +
                "        // 参数1：当前页数\n" +
                "        // 参数2：每页显示的数量\n" +
                "        PageHelper.startPage(3, 2);\n" +
                "        List<User> user = userMapper.selectByExample(null);\n" +
                "        // 分页的各种信息。保存在pageInfo中。可打断点查看具体内容。\n" +
                "        PageInfo pageInfo = new PageInfo(user);\n" +
                "        // 分页要显示的信息保存在 List（变量）中。getList() 获取数据。\n" +
                "        List list = pageInfo.getList();\n" +
                "\n" +
                "        System.out.println(\"当前页:\" + pageInfo.getPageNum());\n" +
                "        System.out.println(\"每页的数量:\" + pageInfo.getPageSize());\n" +
                "        System.out.println(\"当前页显示的数量:\" + pageInfo.getSize());\n" +
                "\n" +
                "        //由于startRow和endRow不常用，这里说个具体的用法\n" +
                "        // 可以在页面中\"显示startRow到endRow 共size条数据\"\n" +
                "        // 当前页面第一个元素在数据库中的行号\n" +
                "        // 当前页面最后一个元素在数据库中的行号\n" +
                "        System.out.println(\"显示\" + pageInfo.getStartRow() + \"到\" + pageInfo.getEndRow() + \"共\" + pageInfo.getSize() + \"条数据\");\n" +
                "        System.out.println(\"当前页面第一个元素在数据库中的行号: \" + pageInfo.getStartRow());\n" +
                "        System.out.println(\"当前页面最后一个元素在数据库中的行号: \" + pageInfo.getEndRow());\n" +
                "        System.out.println(\"总记录数: \" + pageInfo.getTotal());\n" +
                "        System.out.println(\"总页数: \" + pageInfo.getPages());\n" +
                "        System.out.println(\"前一页：\" + pageInfo.getPrePage());\n" +
                "        System.out.println(\"下一页:\" + pageInfo.getNextPage());\n" +
                "        System.out.println(\"是否为第一页:\" + pageInfo.isIsFirstPage());\n" +
                "        System.out.println(\"是否为最后一页:\" + pageInfo.isIsLastPage());\n" +
                "        System.out.println(\"是否有前一页:\" + pageInfo.isHasPreviousPage());\n" +
                "        System.out.println(\"是否有下一页:\" + pageInfo.isHasNextPage());\n" +
                "        System.out.println(\"导航页码数:\" + pageInfo.getNavigatePages());\n" +
                "        System.out.println(\"所有导航页码数:\");\n" +
                "\n" +
                "        for (int i : pageInfo.getNavigatepageNums()) {\n" +
                "            System.out.println(\" \" + i + \",\");\n" +
                "        }\n" +
                "        return list;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "```\n" +
                "这里就不写前端界面了。可以使用postMan或者火狐浏览器。直接测试就行了。\n" +
                "### 配置文件\n" +
                "```yml\n" +
                "server:\n" +
                "  port: 8080\n" +
                "\n" +
                "spring:\n" +
                "  datasource:\n" +
                "    username: root\n" +
                "    password: root\n" +
                "    url: jdbc:mysql://localhost:3306/yige\n" +
                "    driver-class-name: com.mysql.jdbc.Driver\n" +
                "    type: com.alibaba.druid.pool.DruidDataSource\n" +
                "    filters: stat\n" +
                "    maxActive: 20\n" +
                "    initialSize: 1\n" +
                "    maxWait: 60000\n" +
                "    minIdle: 1\n" +
                "    timeBetweenEvictionRunsMillis: 60000\n" +
                "    minEvictableIdleTimeMillis: 300000\n" +
                "    validationQuery: select 'x'\n" +
                "    testWhileIdle: true\n" +
                "    testOnBorrow: false\n" +
                "    testOnReturn: false\n" +
                "    poolPreparedStatements: true\n" +
                "    maxOpenPreparedStatements: 20\n" +
                "\n" +
                "\n" +
                "#pagehelper分页插件\n" +
                "pagehelper:\n" +
                "  helperDialect: mysql\n" +
                "  reasonable: true\n" +
                "  supportMethodsArguments: true\n" +
                "  params: count=countSql\n" +
                "\n" +
                "\n" +
                "## 该配置节点为独立的节点，有很多同学容易将这个配置放在spring的节点下，导致配置无法被识别\n" +
                "mybatis:\n" +
                "  mapper-locations: classpath:mapping/*.xml #注意：一定要对应mapper映射xml文件的所在路径\n" +
                "  type-aliases-package: com.annie.entity # 注意：对应实体类的路径\n" +
                "```\n" +
                "\n" +
                "\n" +
                "扩展内容：[扩展内容](http://www.baidu.com)\n" +
                "我的github主页：[github](https://github.com/yundongzhang)\n" +
                "本项目地址：[springboot2](https://github.com/yundongzhang/SpringBoot2)";
        model.addAttribute("str", str);

        return "show";
    }


    @RequestMapping("/save")
    @ResponseBody
    public String save(String data) {
        System.out.println(data);
        return "success";
    }


}

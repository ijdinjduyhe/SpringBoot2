package com.annie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 声明开启一个EurekaServer
@EnableEurekaServer
public class CloudServiceApplication {

    public static void main(String[] args) {


        SpringApplication.run(CloudServiceApplication.class, args);


    }
}

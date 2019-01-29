package com.annie;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboService1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboService1Application.class, args);
    }

}


package com.annie;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboService2Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboService2Application.class, args);
    }

}


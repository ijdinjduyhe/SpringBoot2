package com.annie.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringCloud {


    @Value("${server.port}")
    private String ip;

    @RequestMapping("/getName")
    public String getName(@RequestParam(value = "name", defaultValue = "zhang") String name) {

        return "你的名字是：" + name + "--->IP为：" + ip;
    }


}

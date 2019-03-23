package com.annie.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    // 熔断注解，当方法执行出现错误的时候会执行。
    @HystrixCommand(fallbackMethod = "functionError")
    public String getName(String name) {
        return restTemplate.getForObject("http://CLOUD-CLIENT/getName?name=" + name, String.class);
    }


    public String functionError(String name) {
        return "hi:"+name+"。发生了错误,本次调用方法失败!";
    }

}


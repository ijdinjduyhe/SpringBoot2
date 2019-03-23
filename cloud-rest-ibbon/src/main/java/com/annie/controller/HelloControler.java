package com.annie.controller;

import com.annie.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/getName")
    public String getName(@RequestParam String name) {
        return helloService.getName(name);
    }



}



package com.annie.controller;


import com.annie.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    @Autowired
    private FeignClientService feignClientService;


    @GetMapping(value = "/getName")
    public String getName(@RequestParam(value = "name",defaultValue = "zhangsan") String name) {
        return feignClientService.getName(name);
    }

}

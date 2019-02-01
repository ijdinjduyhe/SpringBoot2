package com.annie.controller;

import com.annie.entity.User;
import com.annie.entity.UserExample;
import com.annie.mapper.UserMapper;
import com.annie.service.TestService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Testontroller {

    @Autowired
    TestService testService;


    @ResponseBody
    @RequestMapping("/getName")
    public PageInfo getName(){
        PageInfo name = testService.getName();
        return name;
    }






}

package com.annie.controller;


import com.annie.entity.User;
import com.annie.entity.UserExample;
import com.annie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {

    @Autowired
    UserMapper userMapper;


    @ResponseBody
    @RequestMapping("/test")
    public List<User> user(String name){

        UserExample examlp = new UserExample();
        UserExample.Criteria criteria = examlp.createCriteria();
        criteria.andUNameEqualTo(name);
        List<User> users = userMapper.selectByExample(examlp);

        return users;
    }


    @RequestMapping("/testAll")
    @ResponseBody
    public List<User> userAll(){

        List<User> users = userMapper.selectByExample(null);

        return users;
    }



}
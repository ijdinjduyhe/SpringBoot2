package com.annie.controller;


import com.annie.entity.User;
import com.annie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/test")
    @ResponseBody
    public List<User> getName(){
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

}

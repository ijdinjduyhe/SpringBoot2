package com.annie.service;

import com.annie.entity.User;
import com.annie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    UserMapper userMapper;



    public List<User> getUser(){
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

}

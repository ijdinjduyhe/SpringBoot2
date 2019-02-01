package com.annie.service;


import com.annie.entity.User;
import com.annie.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    UserMapper userMapper;


    public PageInfo getName(){

        //引入分页查询，使用PageHelper分页功能
        //在查询之前传入当前页，然后多少记录
        PageHelper.startPage(2,2);  // 参数一：当前页。参数二：每页显示数据量

        // 查询到的全部数据
        List<User> users = userMapper.selectByExample(null);

        //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
        PageInfo pageInfo = new PageInfo(users);
        System.out.println("1");
        return pageInfo;
    }


}

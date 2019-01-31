package com.annie.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.annie.inteface.GetName;




@Service
public class GetNameImpl implements GetName {
    @Override
    public String getName(String name) {

        return "你的名字是：" + name;
    }
}

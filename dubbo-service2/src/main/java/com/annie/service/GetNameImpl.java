package com.annie.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.annie.inteface.GetName;
import org.springframework.stereotype.Component;


@Service(version = "1.0.1", timeout = 10000, interfaceClass = GetName.class)
@Component
public class GetNameImpl implements GetName {
    @Override
    public String getName(String name) {
        return "你的名字是：" + name;
    }
}

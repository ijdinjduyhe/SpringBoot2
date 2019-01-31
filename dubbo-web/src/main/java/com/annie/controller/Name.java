package com.annie.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.annie.inteface.GetName;
import com.annie.inteface.SetName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Name {

    @Reference
    private GetName getName;
    @Reference
    private SetName setName;

    @RequestMapping("/getName")
    @ResponseBody
    public String getName(String name) {
        return getName.getName(name);
    }

    @RequestMapping("/setName")
    @ResponseBody
    public String setName(String name){
        return setName.setName(name);
    }



}

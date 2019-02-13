package com.annie.controller;

import com.annie.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class EmailController {


    @Autowired
    private MailUtil mailUtil;


    @RequestMapping("/mail")
    @ResponseBody
    public String sendMail() {

        try {
            mailUtil.sendMail("15037630855@163.com", "123", UUID.randomUUID().toString().substring(0, 6));
        } catch (Exception e) {

            return "发送失败!";
        }

        return "发送成功!";
    }


}

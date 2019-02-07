package com.annie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {



    @RequestMapping("/")
    public String toIndexPage(){
        return "index";
    }



    @RequestMapping("/errorPage")
    public String toErrorPage(){
        return "error";
    }


    @RequestMapping("/homePage")
    public String toHomePage(){
        return "home";
    }

}

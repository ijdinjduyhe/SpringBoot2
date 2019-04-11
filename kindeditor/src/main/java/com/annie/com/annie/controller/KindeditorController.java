package com.annie.com.annie.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;



@Controller
public class KindeditorController {


    @RequestMapping("/index")
    public String index() {

        return "index";
    }


    @ResponseBody
    @RequestMapping("/uploadImg")
    public JSONObject uploadImg(@RequestParam("uploadFile") MultipartFile multipartFile) throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("error",0);
        jsonObject.put("url","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2114569028,998077550&fm=26&gp=0.jpg");

        return jsonObject;
    }





}

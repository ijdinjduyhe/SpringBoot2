package com.annie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {


    /**
     * 页面跳转-上传
     * @return
     */
    @RequestMapping("/fileUploadePage")
    public String fileUploadePage() {

        return "fileUploade";
    }

    /**
     * 页面跳转-删除
     * @return
     */
    @RequestMapping("/fileDeletePage")
    public String fileDeletePage() {

        return "fileDelete";
    }


}

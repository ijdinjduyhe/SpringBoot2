package com.annie.controller;

import com.annie.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {

    @Autowired
    private FastDFSClient fastDFSClient;


    /**
     * 删除 fastDFS 文件服务器中的文件
     * @param groupName
     * @param remoteFilename
     * @return
     */
    @RequestMapping("/deleteFile")
    @ResponseBody
    public String deleteFile(@RequestParam("groupName") String groupName, @RequestParam("remoteFilename") String remoteFilename) {
        int i = fastDFSClient.deleteFile(groupName, remoteFilename);
        return String.valueOf(i);
    }


    /**
     * 上传文件到 fastDFS 文件服务器
     * @param file
     * @return
     */
    @RequestMapping("/uploadeFile")
    @ResponseBody
    public String uploadeFile(@RequestParam(value = "filename", required = true) MultipartFile file) {


        try {
            // 获得文件名
            String originaleFilename = file.getOriginalFilename();
            // 得到扩展名
            String extName = originaleFilename.substring(originaleFilename.lastIndexOf(".") + 1);
            // 获取文件上传的位置
            String[] fastDFSs = fastDFSClient.uploadFile(file.getBytes(), extName);

            // 遍历获取的位置
            for (String str : fastDFSs) {
                System.out.println(str);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return "1";
    }


}

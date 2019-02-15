package com.annie.controller;

import com.annie.entity.EditorEntityReturn;
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
     *
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
     *
     * @param file
     * @return
     */
    @RequestMapping("/uploadeFile")
    @ResponseBody
    public EditorEntityReturn uploadeFile(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file) {

        // 储存上传的图片信息
        String strs[] = new String[2];
        EditorEntityReturn editorEntityReturn = new EditorEntityReturn();
        try {
            // 获得文件名
            String originaleFilename = file.getOriginalFilename();
            // 得到扩展名
            String extName = originaleFilename.substring(originaleFilename.lastIndexOf(".") + 1);
            // 获取文件上传的位置
            String[] fastDFSs = fastDFSClient.uploadFile(file.getBytes(), extName);

            // 遍历获取的位置
            for (int j = 0; j < fastDFSs.length; j++) {
                System.out.println(fastDFSs[j]);
                // 赋值到数组
                strs[j] = fastDFSs[j];
            }


        } catch (Exception e) {
            System.out.println(e);
            // 上传失败直接返回出去
            editorEntityReturn.setSuccess(0);
            editorEntityReturn.setMessage("上传失败!");
            return editorEntityReturn;
        }


        // 设置是否上传成功
        editorEntityReturn.setSuccess(1);
        // 设置提示信息
        editorEntityReturn.setMessage("上传成功！");
        // 设置图片位置
        StringBuffer sb = new StringBuffer();
        sb.append("http://192.168.25.132:8888/");
        sb.append(strs[0]);
        sb.append("/");
        sb.append(strs[1]);
        editorEntityReturn.setUrl(String.valueOf(sb));

        return editorEntityReturn;
    }


}

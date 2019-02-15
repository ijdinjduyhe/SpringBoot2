package com.annie.controller;

import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    /**
     * 删除照片
     * @return
     */
    @ResponseBody
    @RequestMapping("/fileDelete")
    public String deleteFile() {
        try {

            // 获取resources下的 fdfs_client.conf 配置
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();

            // 1. 加载配置文件
            ClientGlobal.init(filePath);

            // 2. 构建一个管理者客服端
            TrackerClient client = new TrackerClient();

            // 3. 连接管理者服务端
            TrackerServer connection = client.getConnection();

            // 4. 声明服务端
            StorageServer storageServer = null;

            // 5. 获取存储服务器的客户端对象
            StorageClient storageClient = new StorageClient(connection, storageServer);

            // 6. 文件删除
            int i = storageClient.delete_file("group1", "M00/00/00/wKgZhFxmoqSAHOGiAAARd5qY0yU180.jpg");

            System.out.println(i);

        } catch (Exception e) {
            return "0";
        }

        return "1";

    }

    /**
     * 保存照片
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/fileUploade")
    public String fileUploade() {
        try {
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();

            // 1. 加载配置文件
            ClientGlobal.init(filePath);

            // 2. 构建一个管理者客服端
            TrackerClient client = new TrackerClient();

            // 3. 连接管理者服务端
            TrackerServer connection = client.getConnection();

            // 4. 声明服务端
            StorageServer storageServer = null;

            // 5. 获取存储服务器的客户端对象
            StorageClient storageClient = new StorageClient(connection, storageServer);

            // 6. 上传文件
            // 参数一： 文件本地位置。
            // 参数二：文件扩展名
            // 参数三：文件的详情信息
            // 返回一个显示结果，即文件位置
            String[] jpgs = storageClient.upload_file("D:\\1_weixin_39933264.jpg", "jpg", null);


            // 7. 打印上次文件的位置
            for (String jps : jpgs) {
                System.out.println(jps);
            }

        } catch (Exception e) {
            System.out.println("出错了");
        }

        return "1";
    }


}

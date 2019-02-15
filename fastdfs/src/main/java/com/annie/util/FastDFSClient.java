package com.annie.util;


import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;


@Component
public class FastDFSClient {

    private static TrackerClient client = null;

    private static TrackerServer connection = null;

    private static StorageServer storageServer = null;

    private static StorageClient storageClient = null;

    static {
        try {
            // 获取resources下的 fdfs_client.conf 配置
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();

            // 1. 加载配置文件
            ClientGlobal.init(filePath);

            // 2. 构建一个管理者客服端
            client = new TrackerClient();

            // 3. 连接管理者服务端
            connection = client.getConnection();

            // 4. 声明服务端
            storageServer = null;

            // 5. 获取存储服务器的客户端对象
            storageClient = new StorageClient(connection, storageServer);

        } catch (Exception e) {
            System.out.println("出错了~  初始化");
        }

    }


    /**
     * 上传图片(二进制的方式)
     *
     * @param fileContent 二进制文件
     * @param extName     文件后缀名
     * @return
     * @throws Exception
     */
    public String[] uploadFile(byte[] fileContent, String extName) throws Exception {
        return storageClient.upload_file(fileContent, extName, null);
    }


    /**
     * 删除图片
     * @param remoteFilename  远程文件地址  ---group1
     * @param groupName       文件位置  ---M00/00/00/wKgZhFxmsCOAcGt-AAJo41-luP0043.jpg
     * @return
     */
    public int deleteFile(String groupName, String remoteFilename) {

        try {
           storageClient.delete_file(groupName, remoteFilename);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

}
//group1
//M00/00/00/wKgZhFxmsCOAcGt-AAJo41-luP0043.jpg
///
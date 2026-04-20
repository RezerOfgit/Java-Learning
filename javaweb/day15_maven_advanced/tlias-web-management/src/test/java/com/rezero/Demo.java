package com.rezero;

import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.aliyun.oss.common.comm.SignVersion;
import com.aliyun.oss.model.PutObjectRequest;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        // 1. 基础配置
        String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
        String bucketName = "web-tlias-rezero";
        String region = "cn-shanghai";

        // 填入密钥（仅供 main 方法测试用，真实项目在 Controller 里会读取 properties）
        String accessKeyId = "OSS_ACCESS_KEY_ID"; // 替换阿里云信息
        String accessKeySecret = "OSS_ACCESS_KEY_SECRET";

        // 2. 文件配置
        // objectName: 上传到 OSS 后，这个文件叫什么名字？
        String objectName = "test-image.png";
        // localFilePath: 你电脑上那张真实图片的绝对路径
        String localFilePath = "C:\\Users\\Re-zero\\Desktop\\images\\1.png";

        // 3. 开启 V4 签名并配置鉴权
        ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
        clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
        DefaultCredentialProvider credentialsProvider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);

        // 4. 创建 OSS 客户端
        OSS ossClient = OSSClientBuilder.create()
                .endpoint(endpoint)
                .credentialsProvider(credentialsProvider)
                .clientConfiguration(clientBuilderConfiguration)
                .region(region)
                .build();

        try {
            System.out.println("正在连接阿里云，准备发射...");

            // 5. 核心修改：真正的文件上传姿势！
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, new java.io.File(localFilePath));
            ossClient.putObject(putObjectRequest);

            System.out.println("上传成功！快去阿里云控制台看看有没有一个叫 test-image.png 的图片！");
        } catch (Exception e) {
            System.out.println("翻车了，错误信息：" + e.getMessage());
            e.printStackTrace();
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
                System.out.println("🔌 水管已关闭。");
            }
        }
    }
}

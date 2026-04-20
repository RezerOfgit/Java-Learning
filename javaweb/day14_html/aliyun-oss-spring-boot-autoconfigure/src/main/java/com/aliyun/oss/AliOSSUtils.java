package com.aliyun.oss;

import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.aliyun.oss.common.comm.SignVersion;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author Re-zero
 * @version 1.0
 */
public class AliOSSUtils {

//    // 利用 Spring Boot 的 @Value 注解，自动从 application.properties 读取配置项
//    @Value("${aliyun.oss.endpoint}")
//    private String endpoint;
//
//    @Value("${aliyun.oss.accessKeyId}")
//    private String accessKeyId;
//
//    @Value("${aliyun.oss.accessKeySecret}")
//    private String accessKeySecret;
//
//    @Value("${aliyun.oss.bucketName}")
//    private String bucketName;

    private AliOSSProperties aliOSSProperties;

    public AliOSSProperties getAliOSSProperties() {
        return aliOSSProperties;
    }

    public void setAliOSSProperties(AliOSSProperties aliOSSProperties) {
        this.aliOSSProperties = aliOSSProperties;
    }

    // V4 签名强制要求的地域标识 (你选的是上海，所以固定写这个即可)
    private String region = "cn-shanghai";

    /**
     * 实现上传图片到OSS
     */
    public String upload(MultipartFile file) throws IOException {

        String endpoint = aliOSSProperties.getEndpoint();
        String accessKeyId = aliOSSProperties.getAccessKeyId();
        String accessKeySecret = aliOSSProperties.getAccessKeySecret();
        String bucketName = aliOSSProperties.getBucketName();

        // 1. 获取上传的文件的输入流
        InputStream inputStream = file.getInputStream();

        // 2. 避免文件覆盖，使用 UUID 重新生成随机文件名
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

        // 3. 核心改造：开启 V4 签名机制
        ClientBuilderConfiguration conf = new ClientBuilderConfiguration();
        conf.setSignatureVersion(SignVersion.V4);
        DefaultCredentialProvider provider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);

        // 4. 创建 OSSClient 实例
        OSS ossClient = OSSClientBuilder.create()
                .endpoint(endpoint)
                .credentialsProvider(provider)
                .clientConfiguration(conf)
                .region(region)
                .build();

        try {
            // 5. 上传文件到 OSS
            ossClient.putObject(bucketName, fileName, inputStream);
        } finally {
            // 6. 无论成功失败，必须关闭 ossClient，释放水管资源
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        // 7. 拼接并返回文件访问的 URL 路径
        // 例如：https://web-tlias-rezero.oss-cn-shanghai.aliyuncs.com/uuid.png
        String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;
        return url;
    }

}
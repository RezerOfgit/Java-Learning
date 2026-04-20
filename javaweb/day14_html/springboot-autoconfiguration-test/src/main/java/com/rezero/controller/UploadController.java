package com.rezero.controller;

import com.aliyun.oss.AliOSSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public String upload(MultipartFile image) throws Exception {
        //上传文件到阿里云 OSS
        String url = aliOSSUtils.upload(image);
        return url; //https://web-tlias-rezero.oss-cn-shanghai.aliyuncs.com/8bee915a-43e3-4cbd-bbf2-222fb3896705.png
    }

}

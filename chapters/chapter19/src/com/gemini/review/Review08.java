package com.gemini.review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review08 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\Java_IO_Base\\mysql.properties";

        Properties properties = new Properties();

        // 1. 先开输入流读取
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String ip = properties.getProperty("ip");
        System.out.println("原来的ip = " + ip);
        properties.setProperty("ip", "192.168.1.254");

        // 2. 再开输出流覆盖写入
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            properties.store(fos, "Update IP");
            System.out.println("修改ip成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

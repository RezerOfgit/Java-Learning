package com.gemini.task_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task17 {
    public static void main(String[] args) {
        String srcFilePath = "d:\\Java_IO_Base\\sys_log.txt";
        String destFilePath = "d:\\Java_IO_Base\\sys_log_bak.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组, 提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }
            System.out.println("拷贝ok...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入流和输出流, 释放资源
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

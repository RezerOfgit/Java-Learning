package com.gemini.review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review09 {
    public static void main(String[] args) {
        log("服务器启动成功...");
        log("警告：内存占用超过 80%！");
        log("收到新用户 Re-zero 的登录请求。");
    }
    public static void log(String msg){
        String filePath = "D:\\Java_IO_Base\\server.log";
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filePath,true),true)) {
            printWriter.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

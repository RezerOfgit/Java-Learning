package com.gemini.task_;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 字符输入流体验 (FileReader)
 * 专门用来读取纯文本文件，专治中文乱码！
 */
public class Task07 {
    public static void main(String[] args) {
        // 1. 找到昨晚写的那封信
        String filePath = "goodnight_note.txt";

        FileReader fr = null;

        try {
            // 2. 创建字符输入流对象
            fr = new FileReader(filePath);

            // 3. 准备字符水桶（注意：这里是 char[] 不是 byte[] 啦！）
            char[] buf = new char[8];
            int readLen = 0;

            System.out.println("=== 💌 正在拆开昨晚的信件 ===\n");

            // 4. 循环读取字符到 buf 数组中
            while ((readLen = fr.read(buf)) != -1) {
                // 将读到的有效字符转成字符串，直接打印
                System.out.print(new String(buf, 0, readLen));
            }

            System.out.println("\n\n=== 💌 信件读取完毕 ===");

        } catch (IOException e) {
            System.out.println("糟糕，找不到信件了，是不是文件名写错了？");
            e.printStackTrace();
        } finally {
            // 5. 阅后即焚（关流释放资源）
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
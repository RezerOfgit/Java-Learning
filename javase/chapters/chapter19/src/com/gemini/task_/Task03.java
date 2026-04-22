package com.gemini.task_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 使用输入流读取刚才写的日记
 */
public class Task03 {
    public static void main(String[] args) {
        // 1. 指定要读取的文件 (必须和刚才写的文件名一致)
        String filePath = "recovery_diary.txt";

        FileInputStream fis = null;

        try {
            // 2. 创建输入流对象 (如果文件不存在，这里会抛异常)
            fis = new FileInputStream(filePath);

            // 3. 准备一个“小桶” (字节数组)
            // 每次读取 8 个字节 (实际开发中通常用 1024)
            byte[] buf = new byte[8];
            int readLen = 0;

            System.out.println("=== 开始读取日记内容 ===");

            // 4. 循环读取
            // fis.read(buf) 会返回实际读到的字节数。如果读到文件末尾，返回 -1
            while ((readLen = fis.read(buf)) != -1) {
                // 5. 把字节转成字符串显示
                // 只转换读取到的有效部分 (0 到 readLen)
                System.out.print(new String(buf, 0, readLen));
            }

            System.out.println("\n=== 读取结束 ===");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. 关流 (好习惯)
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
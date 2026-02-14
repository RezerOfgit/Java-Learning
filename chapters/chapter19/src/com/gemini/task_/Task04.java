package com.gemini.task_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 终极缝合怪 —— 文件拷贝 (File Copy)
 * 把刚才写的日记，备份一份！
 */
public class Task04 {
    public static void main(String[] args) {
        // 1. 指定源文件和目标文件 (都在项目根目录下)
        String srcFilePath = "recovery_diary.txt";         // 源文件（刚才写的）
        String destFilePath = "recovery_diary_backup.txt"; // 目标文件（要备份出来的）

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 2. 创建流对象 (接好水管)
            fis = new FileInputStream(srcFilePath);
            fos = new FileOutputStream(destFilePath); // 默认覆盖模式，如果存在就清空重写

            // 3. 准备一个“水桶” (通常大小设为 1024 字节，即 1KB)
            byte[] buf = new byte[1024];
            int readLen = 0;

            System.out.println("=== 开始备份日记 ===");

            // 4. 核心循环：一边抽水，一边倒水！
            // fis.read(buf) 负责把水抽进桶里
            while ((readLen = fis.read(buf)) != -1) {
                // fos.write 负责把桶里的水倒进新文件
                // 注意：读了多少 (readLen) 就倒多少，千万别写 fos.write(buf)，那样最后一次可能会多倒点脏水
                fos.write(buf, 0, readLen);
            }

            System.out.println("=== 备份成功！请刷新项目目录查看 ===");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5. 关流：好习惯是【先开的后关，后开的先关】
            try {
                if (fos != null) fos.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
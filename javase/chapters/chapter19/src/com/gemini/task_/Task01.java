package com.gemini.task_;

import java.io.File;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        // 1. 创建一个文件对象 (只是在内存里创建，硬盘上还没有)
        // 请把路径改成你电脑上存在的路径
        File file = new File("d:\\io_test.txt");

        try {
            // 2. 执行创建 (这时硬盘上才会真正出现文件)
            if (file.createNewFile()) {
                System.out.println("文件创建成功！");
            } else {
                System.out.println("文件已存在，不用创建。");
            }

            // 3. 顺便打印一下它的信息
            System.out.println("文件名：" + file.getName());
            System.out.println("绝对路径：" + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
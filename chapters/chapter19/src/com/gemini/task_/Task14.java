package com.gemini.task_;

import java.io.File;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
        //1. 建小区（创建目录）：在你的 D 盘创建一个名为 Java_IO_Base 的文件夹。
        String directoryPath = "d:\\Java_IO_Base";
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            boolean dirCreated = dir.mkdir();
            if (!dirCreated) {
                System.out.println("创建失败");
                return;
            }
        } else {
            System.out.println("已存在");
        }


        //2. 盖房子（创建文件）：在这个新建的 Java_IO_Base 文件夹下，创建两个文件
        //config.txt, temp_data.txt
        String fileName01 = "config.txt";
        String fileName02 = "temp_data.txt";
        File file1 = new File(dir, fileName01);
        File file2 = new File(dir, fileName02);
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("文件创建成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3. 查户口（获取信息）：获取并打印 config.txt 的以下信息：
        //文件名//绝对路径//文件大小（字节）
        //判断它是文件 (isFile()) 还是目录 (isDirectory())。
        System.out.println("文件名字 = " + file1.getName());
        System.out.println("文件绝对路径 = " + file1.getAbsolutePath());
        System.out.println("文件大小(字节) = " + file1.length());
        if (file1.isFile()) {
            System.out.println(file1.getName() + "是文件");
        }else {
            System.out.println(file1.getName() + "是目录");
        }

        //4. 拆迁（删除）：判断 temp_data.txt 是否存在，如果存在，把它删除。
        if (file2.delete()) {
            System.out.println(fileName02 + "删除成功");
        }else {
            System.out.println(fileName02 + "删除失败");
        }
    }
}

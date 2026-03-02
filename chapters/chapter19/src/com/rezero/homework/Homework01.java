package com.rezero.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * 1.编程题Homework01.java 5min
 * （1）在判断d盘下是否有文件夹mytemp，如果没有就创建mytemp
 * （2）在d:\\mytemp 目录下，创建文件hello.txt
 * （3）如果hello.txt已经存在，提示该文件已经存在，就不要再重复创建了
 * （4）并且在hello.txt文件中，写入hello,world~
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        String directoryPath = "d:\\mytemp";
        String fileName = "hello.txt";

        File directory = new File(directoryPath);
        File file = new File(directory, fileName);

        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("目录创建成功" + directory.getAbsolutePath());
            } else {
                System.out.println("目录创建失败");
                return;
            }
        }
        String filePath = file.getAbsolutePath();
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("文件创建成功" + filePath);
            } else {
                System.out.println("文件创建失败");
            }
        }else {
            System.out.println("文件已存在" + filePath);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("hello, world");
        bufferedWriter.close();
    }
}

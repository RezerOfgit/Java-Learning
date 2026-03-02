package com.rezero.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * 2.编程题 Homework02.java
 * 要求：使用BufferedReader读取一个文本文件，为每行加上行号再连同内容一并输出到屏幕上。
 */
public class Homework02 {
    public static void main(String[] args) {
        String filePath = "d:\\story.txt";
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println((++count) + " "+ line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

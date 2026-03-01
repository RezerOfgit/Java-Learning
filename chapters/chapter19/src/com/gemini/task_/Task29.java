package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task29 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\hello_gbk.txt";
        String charSet = "gbk";
        try (
                OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(filePath), charSet);
                BufferedWriter bos = new BufferedWriter(osw);
            ){
            bos.write("“你好，这是一段用GBK编码写入的中文！”");
            System.out.println("保存成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

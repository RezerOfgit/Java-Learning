package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task28 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\gbk_test.txt";
        String charSet = "gbk";
        try (
            InputStreamReader isr = new InputStreamReader(
                    new FileInputStream(filePath), charSet);
            BufferedReader bis = new BufferedReader(isr);
            ){

            String s = bis.readLine();
            System.out.println("读取内容=" + s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

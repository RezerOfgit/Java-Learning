package com.gemini.task_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task30 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\print_test.txt";

        try (PrintWriter pw = new PrintWriter(
                new FileWriter(filePath))
        ) {
            pw.println("这是 PrintWriter 打印的第一行！");
            pw.println("它自带换行，简直和 System.out 一模一样！");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

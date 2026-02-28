package com.gemini.task_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task21 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\buffered_note.txt";
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            bufferedWriter.write("Hello,缓冲字符流!");
            bufferedWriter.newLine();
            bufferedWriter.write("第二行：使用 newLine() 换行太优雅了。");
            bufferedWriter.newLine();
            bufferedWriter.write("第三行：今天又是充满干劲的一天！");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

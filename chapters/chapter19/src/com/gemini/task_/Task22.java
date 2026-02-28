package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task22 {
    public static void main(String[] args) {
        String srcFilePath = "D:\\Java_IO_Base\\buffered_note.txt";
        String destFilePath = "D:\\Java_IO_Base\\buffered_note_copy.txt";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

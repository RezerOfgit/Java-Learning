package com.gemini.task_;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task18 {
    public static void main(String[] args) {
        String filePath = "d:\\Java_IO_Base\\story.txt";
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[8];

        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

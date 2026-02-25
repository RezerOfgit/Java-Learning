package com.gemini.task_;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task16 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\sys_log.txt";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            String str = "System Booting...\nStatus: OK\n";
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

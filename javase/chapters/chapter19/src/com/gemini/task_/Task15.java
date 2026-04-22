package com.gemini.task_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task15 {

    public static void main(String[] args) {

    }
    @Test
    public void readFile(){
        //创建FileInputStream对象
        String filePath = "D:\\Java_IO_Base\\data_config.txt";
        //字节数组
        byte[] buf = new byte[6];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0 , readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

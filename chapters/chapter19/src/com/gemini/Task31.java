package com.gemini;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task31 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("user", "Re-zero");
        properties.setProperty("password", "123456");
        properties.setProperty("ip", "127.0.0.1");

        try {
            properties.load(new FileReader("D:\\Java_IO_Base\\mysql.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

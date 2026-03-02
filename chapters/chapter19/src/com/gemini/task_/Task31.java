package com.gemini.task_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task31 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\mysql.properties";
        Properties properties = new Properties();

        properties.setProperty("user", "Re-zero");
        properties.setProperty("password", "123456");
        properties.setProperty("ip", "127.0.0.1");

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            properties.store(fos, "MySQL Config");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

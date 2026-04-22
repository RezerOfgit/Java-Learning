package com.gemini.task_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task25 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\game_save.dat";

        try (
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        ) {
            System.out.println(ois.readInt());
            Object tank = ois.readObject();
            Tank tank2 = (Tank)tank;
            System.out.println(tank2.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

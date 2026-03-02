package com.gemini.task_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task24 {
    public static void main(String[] args) {
        String filePath = "D:\\Java_IO_Base\\game_save.dat";
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(50);
            oos.writeObject(new Tank("虎式坦克", 100, "穿甲弹"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

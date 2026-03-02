package com.gemini.review;

import com.gemini.task_.Tank;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review10 {
    public static void main(String[] args) {

        String filePath = "D:\\Java_IO_Base\\game_save.dat";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("未检测到存档, 已为您创建初始角色...");
            return;
        } else {

            try (ObjectInputStream ojs = new ObjectInputStream(new FileInputStream(filePath))) {
                int level = ojs.readInt();
                System.out.println("读取到关卡进度: " + level);

                // 然后才能读坦克
                Tank tank11 = (Tank) ojs.readObject();
                System.out.println(tank11);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

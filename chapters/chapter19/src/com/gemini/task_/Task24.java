package com.gemini.task_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
class Tank implements Serializable {
    private String name;
    private int hp;
    private transient String bulletType = "穿甲弹";

    public Tank(String name, int hp, String bulletType) {
        this.name = name;
        this.hp = hp;
        this.bulletType = bulletType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getBulletType() {
        return bulletType;
    }

    public void setBulletType(String bulletType) {
        this.bulletType = bulletType;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", bulletType='" + bulletType + '\'' +
                '}';
    }
}
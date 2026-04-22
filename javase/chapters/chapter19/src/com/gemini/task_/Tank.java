package com.gemini.task_;

import java.io.Serializable;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Tank implements Serializable {
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

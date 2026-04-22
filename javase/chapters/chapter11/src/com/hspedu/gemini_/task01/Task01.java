package com.hspedu.gemini_.task01;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer("亚瑟", new Sword());
        adventurer.fight("小兵");
        adventurer.fight("小兵");
        adventurer.fight("Boss");
        adventurer.fight("小兵");
    }
}

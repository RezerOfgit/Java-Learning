package com.gemini.task_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * Task: Properties 配置文件体验
 * 以后写项目，数据库的账号密码全靠它存！极度舒适！
 */
public class Task13 {
    public static void main(String[] args) {
        // 1. 创建一个配置对象（就是一个专门存属性的小词典）
        Properties gameConfig = new Properties();

        // 2. 往词典里塞东西（键值对 key-value）
        // 注意：这里只能存字符串！
        gameConfig.setProperty("PlayerName", "Re-zero");
        gameConfig.setProperty("Level", "99");
        gameConfig.setProperty("Weapon", "AWM_Sniper");
        gameConfig.setProperty("SoundVolume", "80");

        System.out.println("=== ⚙️ 准备生成游戏配置文件 ===");

        try {
            // 3. 一键保存到硬盘！
            // store(输出流, "文件开头的注释内容")
            gameConfig.store(new FileOutputStream("game_setting.properties"), "Re-zero's Game Configuration");

            System.out.println("=== ✅ 配置文件生成成功！完全不用管怎么排版换行！ ===");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
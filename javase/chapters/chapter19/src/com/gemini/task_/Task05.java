package com.gemini.task_;

import java.io.File;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 文件大侦探 (File Class)
 * 不读写内容，只查户口和建别墅（建文件夹）
 */
public class Task05 {
    public static void main(String[] args) {
        // 1. 锁定目标：我们刚才创建的日记本
        File diary = new File("recovery_diary.txt");

        System.out.println("=== 🔍 开始查户口 ===");

        // 2. 判断这个文件在硬盘上存不存在
        if (diary.exists()) {
            System.out.println("名字：" + diary.getName());
            System.out.println("真身位置 (绝对路径)：" + diary.getAbsolutePath());
            System.out.println("体重 (大小)：" + diary.length() + " 字节 (Byte)");
            System.out.println("身份：" + (diary.isFile() ? "它是一个普通文件" : "它是一个文件夹"));
        } else {
            System.out.println("报告警官，找不到这个文件！");
        }

        System.out.println("\n=== 🏠 开始建别墅 ===");

        // 3. 准备建一个专属的备份文件夹
        File backupDir = new File("MyBackups");

        if (backupDir.exists()) {
            System.out.println("文件夹 'MyBackups' 已经存在啦！");
        } else {
            // 4. mkdir() 创建目录 (如果是多级目录比如 a/b/c，要用 mkdirs())
            if (backupDir.mkdir()) {
                System.out.println("恭喜！'MyBackups' 文件夹创建成功！快去左侧项目目录刷新看看。");
            } else {
                System.out.println("创建失败...");
            }
        }
    }
}
package com.gemini.review_;

import java.time.LocalDateTime;

/**
 * @author Re-zero
 * @version 1.0
 * 考察点：JDK8 新日期类的使用。
 * 题目： 请写出一行代码，获取 "当前系统时间往后推 2 小时 30 分钟"
 * 的 LocalDateTime 对象。 (假设当前时间变量名为 now)
 */
public class Review02 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // 请补全
        LocalDateTime target = now.plusMinutes(150);
        System.out.println(target);
    }
}

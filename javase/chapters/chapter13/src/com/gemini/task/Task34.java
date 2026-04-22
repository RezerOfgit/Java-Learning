package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task34 {
    public static void main(String[] args) {
        Date now = new Date(); // 获取当前时间

        // 目标格式：2026-01-15 10:30:59
        // 请填空：格式化字符串怎么写？
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d hh:mm:ss");

        String str = sdf.format(now);
        System.out.println(str);
    }
}

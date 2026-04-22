package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task36 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // 目标：计算 1000 天后的时间
        // 提示：调用 plusDays(...)
        LocalDateTime future = now.plusDays(1000);

        System.out.println("1000天后是：" + future);
    }
}
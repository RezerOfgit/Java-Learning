package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.Calendar;

public class Task35 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        // 我想获取当前的月份（假设现在是 12 月）
        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        // 请问：如果现实中是 12 月，month 的值会是几？
        // A. 12
        // B. 11
        // C. 1
    }
}
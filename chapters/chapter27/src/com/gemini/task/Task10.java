package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task10 {
    public static void main(String[] args) {
        String phone = "13800138000";
        boolean isValid = phone.matches("\\d{11}");
        System.out.println(isValid);
    }
}

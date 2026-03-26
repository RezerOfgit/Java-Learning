package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task08 {
    public static void main(String[] args) {
        String date = "今日发生系统错误，时间：2026-03-26";
        String regStr = "(\\d{4})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(1));
            System.out.println("找到 " + matcher.group(2));
            System.out.println("找到 " + matcher.group(3));
        }
    }
}

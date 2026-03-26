package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        String content = "Java发布于1995年，目前最新LTS版本是Java21，我的电话是13800138000，我的邮箱是admin@test.com。";
        String regStr = "\\d+";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("连续数字: " + matcher.group(0));
        }

    }
}

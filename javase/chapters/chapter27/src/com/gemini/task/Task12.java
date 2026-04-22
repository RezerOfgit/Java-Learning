package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task12 {
    public static void main(String[] args) {
        String content = "我...我要....学学学学....编程java!";

        //1. 把所有的点号 . 替换成空字符串 ""
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");

        //2.去掉重复的字
        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println("content = " + content);
    }
}

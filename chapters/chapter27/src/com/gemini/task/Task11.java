package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task11 {
    public static void main(String[] args) {
        String text = "我喜欢11，你不喜欢22，他喜欢333";
        String regStr = "(\\d)\\1";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task04 {
    public static void main(String[] args) {
        String text = "a1c aBc a_c a-c a@c";
        String regStr = "a[\\dA-Z_]c";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

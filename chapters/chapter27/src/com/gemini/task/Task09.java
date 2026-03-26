package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task09 {
    public static void main(String[] args) {
        String html = "<div>内容A</div><div>内容B</div>";
        String regStr = "<div>.*?</div>";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

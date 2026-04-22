package com.gemini.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    public static void main(String[] args) {
        String info = "张三是Java工程师，李四是前端开发，王五是测试工程师";
        String regStr = "Java工程师|测试工程师";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(info);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

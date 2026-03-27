package com.rezero.regexp;

import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 演示matches 方法，用于整体匹配, 在验证输入的字符串是否满足条件使用
 */
public class PatternMethod {
    public static void main(String[] args) {

        String content = "hello abc hello, java学习";
//        String regStr = "hello";
        String regStr = "hello.*";
        /**
         * matches方法源码
         *     public static boolean matches(String regex, CharSequence input) {
         *         Pattern p = Pattern.compile(regex);
         *         Matcher m = p.matcher(input);
         *         return m.matches();
         *     }
         */
        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配= " + matches);
    }
}

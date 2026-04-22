package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */
public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jack hellotom hello smith 你好";
//        String regStr = "hello";
        String regStr = "hello.*";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("=================");
            System.out.println(matcher.start());//返回以前匹配的初始索引
            System.out.println(matcher.end());//返回最后匹配字符之后的偏移量(索引+1)
            System.out.println("找到: " + content.substring(matcher.start(), matcher.end()));
        }

        //整体匹配方法，常用于，去校验某个字符串是否满足某个规则
        System.out.println("整体匹配 = " + matcher.matches());

        //完成如果content 有hello 替换成你好
        regStr = "hello";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(content);
        //注意：返回的字符串才是替换后的字符串原来的content 不变化
        String newContent = matcher.replaceAll("你好");
        System.out.println("newContent = " + newContent);
        System.out.println("content = " + content);
    }
}

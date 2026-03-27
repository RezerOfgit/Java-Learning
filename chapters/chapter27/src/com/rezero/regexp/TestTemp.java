package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 */

public class TestTemp {
    public static void main(String[] args) {
        String content = "hello abc 11.1";
        //String regStr =".";// 匹配 除了 \n 的所有字符
        //string regStr = "[.]";// 匹配 .本身
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

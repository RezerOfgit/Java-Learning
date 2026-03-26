package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 选择匹配符
 */
public class RegExp04 {
    public static void main(String[] args) {
        String content = "rezero ab 北京";
        String regStr = "re|a|北";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

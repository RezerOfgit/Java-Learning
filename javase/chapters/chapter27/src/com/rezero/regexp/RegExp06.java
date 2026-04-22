package com.rezero.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 演示定位符的使用
 */
public class RegExp06 {
    public static void main(String[] args) {

//        String content = "123-abc";
        //以至少1 个数字开头，后接任意个小写字母的字符串
//        String regStr = "^[0-9]+[a-z]*";

        //以至少1 个数字开头, 必须以至少一个小写字母结束
//        String regStr = "^[0-9]+\\-[a-z]+$";

        String content = "hanshunping sphan nnhan";
        //表示匹配边界的han[这里的边界是指：被匹配的字符串最后,
        // 也可以是空格的子字符串的后面]
        //1. 先找到 "han"
        //2. 然后检查 "han"【后面】是不是边界
//        String regStr = "han\\b";


        // \\B: 和\\b 的含义刚刚相反
//        han\B 的执行逻辑：
//        1. 先找到 "han"
//        2. 然后检查 "han"【后面】是不是非边界（两边都是字母）
        String regStr = "han\\B";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

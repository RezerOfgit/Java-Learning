package com.rezero.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Re-zero
 * @version 1.0
 * 3.对一个url进行解析 Homework03.java
 * http://www.sohu.com:8080/abc/index.htm
 * a)要求得到协议是什么?   http
 * b)域名是什么?         www.sohu.com
 * c)端口是什么?         8080
 * d)文件名是什么?        index.htm
 */
public class Homework03 {
    public static void main(String[] args) {
        String content = "http://www.sohu.com:8080/abc/index.htm";
        //因为正则表达式是根据要求来编写的，所以，如果需求需要的话，可以改进
        String regStr = "^([a-zA-Z]+)://([a-zA-z.]+):(\\d+)[/\\w-]*/([\\w.]+)$";
        //- 放在字符类的开头或末尾最安全，放在中间可能被正则引擎误读为范围运算符。

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {//整体匹配，如果匹配成功，可以通过group（x），获取对应分组的内容
            System.out.println("整体匹配 = " + matcher.group());
            System.out.println("协议: " + matcher.group(1));
            System.out.println("域名: " + matcher.group(2));
            System.out.println("端口: " + matcher.group(3));
            System.out.println("文件名: " + matcher.group(4));
        } else {
            System.out.println("没有匹配成功");
        }
    }
}

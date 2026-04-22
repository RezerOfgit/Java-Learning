package com.rezero.regexp;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringReg {
    public static void main(String[] args) {
        String content = "2000 年5 月，JDK1.3、JDK1.4 和J2SE1.3 相继发布，几周后其" +
                "获得了Apple 公司Mac OS X 的工业标准的支持。2001 年9 月24 日，J2EE1.3 发" +
                "布。2002 年2 月26 日，J2SE1.4 发布。自此Java 的计算能力有了大幅提升";
        //使用正则表达式方式，将JDK1.3 和JDK1.4 替换成JDK
        content = content.replaceAll("JDK1\\.(3|4)", "JDK");//("JDK1\\.3|JDK1\\.4", "JDK")
        System.out.println(content);//写法2可以用$1更优

        //要求验证一个手机号， 要求必须是以138 139 开头的`
        content = "13888889999";
        if (content.matches("1(38|39)\\d{8}")) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

        //要求按照# 或者- 或者~ 或者数字来分割
        System.out.println("===================");
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}

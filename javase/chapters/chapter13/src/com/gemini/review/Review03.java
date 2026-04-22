package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review03 {
    public static void main(String[] args) {
        // String 部分
        String s1 = "hello";
        String s2 = s1;
        s1 = "world"; // s1 变心了
        System.out.println(s1 == s2); //false,结果1：____ (s2 会跟着变吗？)

        // StringBuffer 部分
        StringBuffer b1 = new StringBuffer("hello");
        StringBuffer b2 = b1;
        b1.append("world"); // b1 修改了自己的内容
        System.out.println(b1 == b2); // true,结果2：____ (b2 指向的内容变了吗？)
    }
}

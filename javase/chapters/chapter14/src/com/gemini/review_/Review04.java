package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review04 {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder("Hello");

        change(s, sb);

        System.out.println("s = " + s);   // 结果 1：Hello
        System.out.println("sb = " + sb); // 结果 2：HelloWorld
    }

    public static void change(String str, StringBuilder builder) {
        str = str + "World";      // 试图修改 String
        builder.append("World");  // 试图修改 StringBuilder
    }
}

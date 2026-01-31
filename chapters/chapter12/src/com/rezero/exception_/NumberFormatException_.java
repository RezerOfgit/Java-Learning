package com.rezero.exception_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "这是名字";
        //将String 转成 int
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}

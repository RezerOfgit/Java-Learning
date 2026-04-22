package com.rezero.stringbuffer_;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        /*
         * 思路分析
         * 1. 定义一个 Scanner 对象，接收用户输入的 价格(String)
         * 2. 希望使用到 StringBuffer 的 insert，需要将 String 转成 StringBuffer
         * 3. 然后使用相关方法进行字符串的处理
         * 代码实现
         */
        //Scanner scanner = new Scanner(System.in);
        String price = "123456.59";
        StringBuffer sb = new StringBuffer(price);
        //先完成一个最简单的实现123456.59
        //找到小数点的索引,然后在该位置的前3位,插入即可
//        int i = sb.lastIndexOf(".");
//        sb = sb.insert(i - 3, ",");
        //上面的两部需要做一个循环处理,才是正确的
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}

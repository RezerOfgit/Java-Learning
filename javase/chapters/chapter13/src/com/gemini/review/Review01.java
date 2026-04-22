package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
    public static void main(String[] args) {
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1); // 打印结果是 1 还是 1.0？
    }
}

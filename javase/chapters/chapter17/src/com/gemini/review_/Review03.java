package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 * 下面这段代码的返回值是多少？ A. 1 B. 2 C. 3 D. 0
 * finally执行了
 * 返回值: 2
 */
public class Review03 {
    public static int test() {
        int i = 1;
        try {
            i++; // i变成2
            return i; // 准备返回2，但发现后面有finally...
        } catch (Exception e) {
            i++;
            return i;
        } finally {
            i++; // i变成3
            System.out.println("finally执行了");
        }
    }

    public static void main(String[] args) {
        System.out.println("返回值: " + test());
    }
}


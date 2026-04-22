package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        // 第一组：100
        Integer n1 = 100;
        Integer n2 = 100;
        System.out.println(n1 == n2);
        // 结果 1：true (在 -128 到 127 缓存范围内，是同一个对象)

        // 第二组：200
        Integer n3 = 200;
        Integer n4 = 200;
        System.out.println(n3 == n4);
        // 结果 2：false (超出了缓存范围，new 了新对象)
    }
}

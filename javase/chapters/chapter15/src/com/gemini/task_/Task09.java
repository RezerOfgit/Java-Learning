package com.gemini.task_;

import org.junit.jupiter.api.Test;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task09 {
    // 1. 这是一个测试方法，不需要 main 也能运行
    // 必须加上这个注解：________
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int res = c.add(10, 20);
        System.out.println("add结果=" + res);
    }

    // 2. 这是另一个测试方法
    // 加上注解：________
    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int res = c.sub(10, 20);
        System.out.println("sub结果=" + res);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
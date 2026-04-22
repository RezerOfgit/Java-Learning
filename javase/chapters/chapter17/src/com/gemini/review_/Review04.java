package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
/*
题目： 下面的代码运行结果是什么？ A. 打印两次 "Thread is running..."
 B. 打印一次 "Thread is running..."，然后报错
 C. 编译错误 D. 什么都不打印
 */
public class Review04 {//B
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        t.start(); // 第一次启动

        // 假设主线程稍微停顿一下，确保子线程跑完
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        t.start(); // 试图再次启动同一个线程对象
    }
}
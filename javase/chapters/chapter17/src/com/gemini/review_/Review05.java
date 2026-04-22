package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 * 题目： 阅读代码，判断控制台输出的大概时间间隔。
 * 问题："End" 是在 "Start" 打印后大约多久打印出来的？
 * A. 立即打印 (几乎 0秒) B. 大约 3秒 C. 大约 5秒 D. 大约 8秒 (3+5)
 */
public class Review05 {//B
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000); // T1 睡 3秒
            } catch (InterruptedException e) {}
        });

        System.out.println("Start");
        t1.start();
        t1.join(); // 关键看这里
        System.out.println("End");
    }
}
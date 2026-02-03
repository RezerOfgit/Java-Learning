package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 * 题目： 如果把 Task 06 的逻辑稍微改一下（如下），
 * Guardian 还会自动停止吗？ 选项： A. 会自动停止 B. 不会停止（死循环）
 */
public class Review06 {//A
    public static void main(String[] args) {
        Thread guardian = new Thread(() -> {
            while (true) {
                System.out.println("我是守护线程");
            }
        });
        guardian.setDaemon(true); // 设置为守护
        guardian.start();

        // 注意：主线程这里启动了一个【新的用户线程】
        new Thread(() -> {
            try { Thread.sleep(5000); } catch (Exception e) {}
            System.out.println("我是另一个用户线程，我活了5秒");
        }).start();

        System.out.println("主线程结束了");
        // 主线程虽死，但那个“5秒的用户线程”还活着...
    }
}
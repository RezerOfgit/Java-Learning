package com.rezero.threaduse;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Thread03Modify {
    public static void main(String[] args) {
        // 这里的两个 task 对象是独立的，它们各自有自己的 count，互不干扰
        // 任务1：打印 "hello world", 上限 10
        Task task1 = new Task("hello world...", 10);
        // 任务2：打印 "hi", 上限 5
        Task task2 = new Task("hi", 5);

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

class Task implements Runnable {
    private int count = 0; // 每个对象都有自己独立的一份 count
    private String message; // 不同的打印内容
    private int maxLoop;    // 不同的循环次数

    // 构造器：创建对象时，告诉我你要打印啥，打印多少次
    public Task(String message, int maxLoop) {
        this.message = message;
        this.maxLoop = maxLoop;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message + (++count) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == maxLoop) {
                break;
            }
        }
    }
}
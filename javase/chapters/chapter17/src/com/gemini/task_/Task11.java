package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task11 {
    public static void main(String[] args) {
        BAccount bAccount = new BAccount();

        // 创建存钱线程
        Thread t1 = new Thread(bAccount);
        t1.setName("Saver");

        // 创建取钱线程
        Thread t2 = new Thread(bAccount);
        t2.setName("Withdraw");

        t1.start();
        t2.start();
    }
}

class BAccount implements Runnable {
    private int balance = 0;

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Saver")) {
            saveLoop();
        } else if (Thread.currentThread().getName().equals("Withdraw")) {
            withdrawLoop();
        }
    }

    // 专门给存钱线程用的循环逻辑
    private void saveLoop() {
        for (int i = 0; i < 3; i++) {
            saveOneThousand(); // 执行一次存钱动作
            try {
                Thread.sleep(1000); // 存完休息一下，给取钱线程机会
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 专门给取钱线程用的循环逻辑
    private void withdrawLoop() {
        for (int i = 0; i < 3; i++) {
            withdrawOneThousand(); // 执行一次取钱动作
            try {
                Thread.sleep(1000); // 取完休息一下
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 核心业务：存钱 (原子操作)
    public synchronized void saveOneThousand() {
        balance += 1000;
        System.out.println(Thread.currentThread().getName() + " 存入1000, 余额 = " + balance);
        // notify(); // 高级用法：唤醒等待取钱的线程(暂时不用)
    }

    // 核心业务：取钱 (原子操作)
    public synchronized void withdrawOneThousand() {
        if (balance >= 1000) {
            balance -= 1000;
            System.out.println(Thread.currentThread().getName() + " 取出1000, 余额 = " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 余额不足(" + balance + ")，取款失败");
            // 这里不需要 loop=false，因为题目只要求取3次，取不到就算了，继续下一次尝试
        }
    }
}
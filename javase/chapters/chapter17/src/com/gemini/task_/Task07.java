package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task07 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        new Thread(bankAccount).start();
        new Thread(bankAccount).start();

    }
}

class BankAccount implements Runnable {
    private int balance = 10000;
    private boolean loop = true;

    public synchronized void withdraw(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (balance >= 1000) {
            System.out.println("取款成功，剩余: " + (balance -= 1000));
        } else {
            loop = false;
            return;
        }
    }
    @Override
    public void run() {
        while (loop) {
            withdraw();
        }
    }
}
/*
双线程竞争：
创建 2 个线程（老公、老婆），共享同一个 BankAccount 对象。
启动线程，观察控制台输出。
修复 Bug：
使用 synchronized 关键字（同步代码块或同步方法），把“判断+扣款”的代码包起来。
确保：只有当一个人取完（或判断失败）后，另一个人才能进去操作。
 */
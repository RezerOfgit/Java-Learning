package com.rezero.method_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        Thread thread = new Thread(t3);//创建子线程
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if (i == 5) {//说明主线程输出了5次hi
                thread.start();//启动子线程 输出 helLo...
                //join() 方法生效的前提是：该线程必须已经启动（start）并且处于“活着（Alive）”的状态。
                thread.join();//立即将t3子线程，插入到main线程，让t3先执行
            }
        }
        System.out.println("主线程结束...");
    }
}

class T3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("hello " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("子线程结束...");
    }
}
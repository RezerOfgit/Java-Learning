package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task04 {
    public static void main(String[] args) throws InterruptedException {
        Lion lion = new Lion();
        Thread thread = new Thread(lion);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程在巡逻...");
            Thread.sleep(1000);
        }
        System.out.println("猎人来了!");
        thread.interrupt();
    }
}
class Lion implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("狮子正在睡觉...");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("狮子被吓醒了,撒腿就跑!");
                //e.printStackTrace();
                break;
            }
        }
    }
}
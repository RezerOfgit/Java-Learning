package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    public static void main(String[] args) throws InterruptedException {
        VIP vip = new VIP();
        for (int i = 1; i <= 20; i++) {
            System.out.println("普通人排队: " + i);
            Thread.sleep(50);
            if (i == 5) {
                //vip.join();
                vip.start();
                vip.join();
            }
        }
    }
}
class VIP extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("VIP 正在办理: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
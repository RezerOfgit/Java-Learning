package com.rezero.threaduse;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
class T1 implements Runnable{

    private int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello world..." + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
class T2 implements Runnable{

    private int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5) {
                break;
            }
        }
    }
}
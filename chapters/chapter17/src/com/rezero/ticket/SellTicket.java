package com.rezero.ticket;

import sun.awt.windows.ThemeReader;

/**
 * @author Re-zero
 * @version 1.0
 * 使用多线程,模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        Sell01 sell01 = new Sell01();
//        Sell01 sell02 = new Sell01();
//        Sell01 sell03 = new Sell01();
//
//        sell01.start();
//        sell02.start();
//        sell03.start();

        System.out.println("====使用实现接口方式来售票====");
        Sell02 sell02 = new Sell02();
        new Thread(sell02).start();//第 1 个线程-窗口
        new Thread(sell02).start();//第 2 个线程-窗口
        new Thread(sell02).start();//第 3 个线程-窗口

    }
}
class Sell01 extends Thread{
    public static int ticketNum = 100;//让多个线程共享 ticketNum
    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }
            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() +
                     " 售出一张票" + ", 剩余票数= " + (--ticketNum));
        }
    }
}

class Sell02 implements Runnable {
    public static int ticketNum = 100;//让多个线程共享 ticketNum
    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }
            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() +
                    " 售出一张票" + ", 剩余票数= " + (--ticketNum));
        }
    }
}
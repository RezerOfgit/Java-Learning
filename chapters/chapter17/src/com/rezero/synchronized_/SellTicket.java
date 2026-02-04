package com.rezero.synchronized_;

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

//        System.out.println("====使用实现接口方式来售票====");
//        Sell02 sell02 = new Sell02();
//        new Thread(sell02).start();//第 1 个线程-窗口
//        new Thread(sell02).start();//第 2 个线程-窗口
//        new Thread(sell02).start();//第 3 个线程-窗口

        //测试
        Sell03 sell03 = new Sell03();
        new Thread(sell03).start();
        new Thread(sell03).start();
        new Thread(sell03).start();

    }
}

//实现接口方式,使用synchronized 实现线程同步
class Sell03 implements Runnable {
    public static int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;
    Object object = new Object();

    //解读
    //1. public synchronized static void m1(){} 锁是加在Sell03.class
    //2. 如果在静态方法中,实现一个同步代码块
    /*
        synchronized (Sell03.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1(){

    }

    public static void m2() {
        synchronized (Sell03.class) {
            System.out.println("m2");
        }
    }

    //说明
    //1. public synchronized void sell(){} 就是一个同步方法
    //2. 这时锁在 this对象
    //3. 也可以在代码块上写 synchronize ,同步代码块, 互斥锁还是在this对象
    public /*synchronized*/ void sell() {//同步方法，在同一时刻，只能有一个线程执行sell方法

        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
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
    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}

//使用Thread方式
// new Sell01().start();
// new Sell01().start();
class Sell01 extends Thread{
    public static int ticketNum = 100;//让多个线程共享 ticketNum

//    public void m1(){
//        synchronized (this) {
//            System.out.println("m1");
//        }
//    }

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
package com.rezero.homework.h01;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * （1）在main方法中启动两个线程
 * （2）第1个线程循环随机打印100以内的整数
 * （3）直到第2个线程从键盘读取了“Q”命令。
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private volatile boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            System.out.println("随机打印100以内的整数" + (int)(Math.random() * 100));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出...");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
//直到第2个线程从键盘读取了"Q"命令
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//构造器中，直接传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入(Q)表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("b线程退出...");
                break;
            }
        }
    }
}
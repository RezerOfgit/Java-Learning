package com.rezero.homework.h02;

/**
 * @author Re-zero
 * @version 1.0
 * （1）有2个用户分别从同一个卡上取钱（总额：10000）
 * （2）每次都取1000，当余额不足时，就不能取款了
 * （3）不能出现超取现象=》线程同步问题。
 */
public class Homework02 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        new Thread(bankAccount).start();
        new Thread(bankAccount).start();
    }
}

//1. 因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式
class BankAccount implements Runnable {
    private int balance = 10000;
    private boolean loop = true;

    //    public synchronized void withdraw(){
//        if (balance < 1000) {
//            System.out.println("余额不足,无法取款");
//            loop = false;
//            return;
//        }
//        try {
//            System.out.println("取款成功，剩余: " + (balance -= 1000));
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    @Override
    public void run() {
        while (loop) {

            //解读
            //1. 这里使用 synchronized 实现了线程同步
            //2. 当多个线程执行到这里时，就会去争夺 this对象锁
            //3. 哪个线程争夺到（获取）this对象锁，就执行 synchronized 代码块，执行完后，会释放this对象锁
            //4. 争夺不到this对象锁，就bLocked ，准备继续争夺
            //5. this对象锁是非公平锁
            synchronized (this) {
                if (balance < 1000) {
                    System.out.println("余额不足,无法取款");
                    loop = false;
                    return;
                }
            }
            try {
                System.out.println("取款成功，剩余: " + (balance -= 1000));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //withdraw();
    }
}
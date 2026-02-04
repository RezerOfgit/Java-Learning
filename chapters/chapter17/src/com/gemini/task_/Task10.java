package com.gemini.task_;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task10 {
    public static void main(String[] args) {
        FuelCrisis sharedObject = new FuelCrisis();

        // 1. 启动坦克耗油线程
        Thread tankThread = new Thread(sharedObject);
        tankThread.setName("TankEngine");
        tankThread.start();

        // 2. 启动补给兵线程 (可以直接用主线程，也可以新开一个)
        Thread supplyThread = new Thread(sharedObject);
        supplyThread.setName("SupplySoldier");
        supplyThread.start();
    }
}

class FuelCrisis implements Runnable {
    private int fuel = 50;
    private volatile boolean loop = true;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("TankEngine")) {
            tankBehavior();
        } else {
            supplyBehavior();
        }
    }

    //坦克行为
    public void tankBehavior() {
        while (loop) {
            //耗油逻辑
            try {
                Thread.sleep(1000);//每隔1秒,油量减少10点
                synchronized (this) {
                    fuel -= 10;
                    System.out.println(Thread.currentThread().getName() + " 消耗燃油，剩余: " + fuel);
                    if (fuel <= 0) {
                        System.out.println("坦克抛锚, 游戏结束!");
                        loop = false; // 通知另一个线程也退出
                        // System.exit(0); // 如果想强行结束所有线程可以用这个
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void supplyBehavior() {
        while (loop) {
            System.out.println("按(J)给坦克加油, 按(Q)直接退出游戏");
            String input = scanner.next().toUpperCase();
            if (input.length() == 0) continue;
            char key = input.charAt(0);

            //char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'J') {
                synchronized (this) { // 加油也要加锁
                    if (fuel > 0) { // 只有没死才能加
                        fuel += 20;
                        if (fuel > 100) fuel = 100; // 上限控制
                        System.out.println(">>> 补给成功！当前油量: " + fuel);
                    }
                }
            } else if (key == 'Q') {
                loop = false;
                System.out.println("直接退出游戏...");
                break;
            }
        }
    }
}

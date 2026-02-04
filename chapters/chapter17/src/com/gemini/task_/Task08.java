package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task08 {
    public static void main(String[] args) {
        Object knife = new Object();
        Object fork = new Object();
        DeadLockSimulation A = new DeadLockSimulation(knife,fork);
        A.setName("爸爸");
        DeadLockSimulation B = new DeadLockSimulation(knife,fork);
        B.setName("妈妈");
        A.start();
        B.start();
    }
}
class DeadLockSimulation extends Thread{
    Object knife;
    Object fork;

    public DeadLockSimulation(Object knife, Object fork) {
        this.knife = knife;
        this.fork = fork;
    }

    @Override
    public void run() {
        if (this.getName().equals("爸爸")) {
            synchronized (knife) {
                System.out.println("爸爸拿到了刀，准备去拿叉子...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (fork) {
                    System.out.println("爸爸吃完了");
                }
            }
        } else if (this.getName().equals("妈妈")) {
            synchronized (fork) {
                System.out.println("妈妈拿到了叉子，准备去拿刀...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (knife) {
                    System.out.println("妈妈吃完了");
                }
            }
        }
    }
}
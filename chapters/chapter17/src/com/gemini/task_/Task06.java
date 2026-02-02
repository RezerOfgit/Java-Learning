package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task06 {
    public static void main(String[] args) throws InterruptedException {
        Guardian guardian = new Guardian();
        guardian.setDaemon(true);
        guardian.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("辛勤工作的员工...");
            Thread.sleep(500);
        }
    }

}

class Guardian extends Thread {
    //private boolean daemon = true;
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("保安在监控...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//    public void setDaemon01(boolean daemon) {
//        this.daemon = daemon;
//    }
}
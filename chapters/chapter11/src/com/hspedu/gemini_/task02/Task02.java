package com.hspedu.gemini_.task02;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    public static void main(String[] args) {
        SmartAirConditioner air = new SmartAirConditioner();
        air.work(Season.SUMMER, new Mode() {
            @Override
            public void execute() {
                System.out.println("开启强力制冷模式");
            }
        });
        air.work(Season.WINTER, new Mode() {
            @Override
            public void execute() {
                System.out.println("开启辅热制暖模式");
            }
        });
    }
}

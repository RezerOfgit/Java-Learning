package com.gemini.inner01;

public class Task01 {
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();

        // 第一次调用：懒猪起床
        // 这里的 new Bell() {...} 就是匿名内部类！
        // 它实现了 Bell 接口，但是没有类名。
        alarmClock.wakeUp(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦！");
            }
        });

        // 第二次调用：上课迟到
        // 再次 new 一个匿名的 Bell，这次逻辑不一样
        alarmClock.wakeUp(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课迟到了！");
            }
        });
    }
}
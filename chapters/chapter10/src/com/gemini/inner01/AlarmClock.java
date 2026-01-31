package com.gemini.inner01;

public class AlarmClock {
    // 关键点：这里要接收一个 Bell 类型的参数！
    // 就像电脑接收 USB 设备一样
    public void wakeUp(Bell bell) {
        bell.ring(); // 调用接口的方法
    }
}

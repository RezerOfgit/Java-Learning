package com.gemini.interface_;

public class Mouse implements UsbInterface{
    @Override
    public void start() {
        System.out.println("鼠标点击了...");
    }

    @Override
    public void stop() {
        System.out.println("鼠标拔出了...");
    }
}

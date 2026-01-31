package com.gemini.interface_;

public class KeyBoard implements UsbInterface{
    @Override
    public void start() {
        System.out.println("键盘敲击了....");
    }

    @Override
    public void stop() {
        System.out.println("键盘拔出了...");
    }
}

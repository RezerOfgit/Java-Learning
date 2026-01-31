package com.gemini.interface2_;

public class Camera implements UsbInterface{

    @Override
    public void start() {
        System.out.println("相机开始连接...");
    }

    @Override
    public void stop() {
        System.out.println("相机退出连接...");
    }
}

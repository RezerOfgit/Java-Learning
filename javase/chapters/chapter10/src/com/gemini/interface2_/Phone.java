package com.gemini.interface2_;

public class Phone implements UsbInterface{
    public void call(){
        System.out.println("正在给女朋友打电话...");
    }

    @Override
    public void start() {
        System.out.println("手机连接USB，开始充电...");
    }

    @Override
    public void stop() {
        System.out.println("手机断开连接...");
    }
}

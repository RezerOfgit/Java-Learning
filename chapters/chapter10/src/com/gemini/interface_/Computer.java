package com.gemini.interface_;

public class Computer {
    public void plugin(UsbInterface usb){
        usb.start();
        System.out.println("===电脑处理数据中===");
        usb.stop();
    }
}

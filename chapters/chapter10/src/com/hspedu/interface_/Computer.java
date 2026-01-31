package com.hspedu.interface_;

public class Computer {
    //编写一个方法，计算机工作
    //解读
    //1. UsbInterface usbInterface 形参是接口类型 UsbInterface
    //2. 看到接收实现了 UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}

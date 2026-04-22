package com.gemini.interface2_;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        UsbInterface[] usbs = new UsbInterface[2];

        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            System.out.println("====第"+ (i + 1) + "个设备====");
            if (usbs[i] != null){
                usbs[i].start();
            }
            if (usbs[i] instanceof Phone){
                ((Phone)usbs[i]).call();
            }
            usbs[i].stop();
        }
    }
}
//java中修饰符public 和 默认，有时省略public，看起来和默认一样，怎么区分
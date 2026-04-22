package com.gemini.test;

public class Computer {
    // 成员内部类 (Cpu)
    class Cpu { }

    // 静态内部类 (Usb)
    static class Usb { }

    public static void main(String[] args) {
        // 错误 1：想创建 Cpu
        //Cpu c = new Cpu();
        new Computer().new Cpu();

        // 错误 2：想创建 Usb
//        Computer computer = new Computer();
//        Usb u = computer.new Usb();
        Computer.Usb usb = new Computer.Usb();
    }
}
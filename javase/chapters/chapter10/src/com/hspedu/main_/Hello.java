package com.hspedu.main_;

public class Hello {
    public static void main(String[] args) {
        //args 是如何传入
        //右上角Hello选择edit configurations
        //遍历显示
        for (int i = 0; i < args.length; i++) {
            System.out.println("第 " + (i + 1) + "个参数=" + args[i]);
        }
    }
}

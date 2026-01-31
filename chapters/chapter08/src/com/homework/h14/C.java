package com.homework.h14;

public class C extends B {
    public C(){
        this("hello");
        System.out.println("我是c类的无参构造");
    }

    public C(String name){
        super("hahah");
        System.out.println("我是c类的有参参构造");
    }
}

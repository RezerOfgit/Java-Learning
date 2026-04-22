package com.hspedu.codeblock_;

import javax.jws.soap.SOAPBinding;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
        //(1)A 静态代码块 01 被调用...(2) getN1 被调用...
        // (3)A 普通代码块01 被调用...(4)getN2 被调用...(5)A() 构造器被调用
    }
}
class A{
    static {//静态代码块
        System.out.println("A 静态代码块01 被调用...");
    }
    //静态属性的初始化
    private static int n1 = getN1();
    public static int getN1(){
        System.out.println("getN1() 被调用...");
        return 100;
    }
    {
        System.out.println("A 普通代码块01 被调用...");
    }
    private int n2 = getN2();
    public int getN2(){
        System.out.println("getN2 被调用...");
        return 200;
    }

    public A() {//无参构造器
        System.out.println("A() 构造器被调用...");
    }
}
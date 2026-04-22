package com.hspedu.extend_;

public class Base {//父类
    public int n1 = 100;
    protected int n2 =200;
    int n3 =300;
    private int n4 = 400;
    public Base(){//无惨构造器
        System.out.println("父类base()构造器被调用...");
    }
    public Base(String name, int age){//有惨构造器
        System.out.println("父类base(String name, int age)构造器被调用...");
    }
    public Base(String name){//有惨构造器
        System.out.println("父类base(String name)构造器被调用...");
    }

    //父类提供一个public 的方法，返回n4
    public int getN4(){
        return n4;
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    //call
    public void calltest400(){
        test400();
    }
}

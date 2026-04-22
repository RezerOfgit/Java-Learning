package com.homework.h07;

public class Homework07 {
    public static void main(String[] args) {
        // 第一部分：无参构造测试
        System.out.println("--- 第一次运行 ---");
        //new Demo().test();
        Demo d = new Demo();
        d.test();

        System.out.println(); // 换行，方便区分

        // 第二部分：有参构造测试
        System.out.println("--- 第二次运行 ---");
        //new Demo("john").test();
        Demo john = new Demo("john");
        john.test();
    }
}

class Test {
    String name = "Rose";

    Test() {
        System.out.println("Test");
    }

    Test(String name) {
        this.name = name;
        System.out.println(this.name);
    }
}

class Demo extends Test {
    String name = "Jack";

    Demo() {
        super();
        System.out.println("Demo");
    }

    Demo(String s) {

        super(s);
    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
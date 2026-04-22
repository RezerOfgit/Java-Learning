package com.hspedu.poly_.dynamic_;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//?40 //20
        System.out.println(a.sum1());//?30
    }
}

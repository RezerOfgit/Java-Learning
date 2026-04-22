package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
interface IA {
    void cry();
}
/*
有一个接口 IA，里面有一个方法 cry()。 请不创建新的 .java 文件，
也不创建新的 class 类，直接在 main 方法中创建一个实现了 IA 接口的对象，
并调用 cry() 打印 "哇哇哇"。
 */
public class Review01 {
    public static void main(String[] args) {
        // 请在此处补充代码
        // IA tiger = ...
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("哇哇哇");
            }
        };
        tiger.cry();
    }
}

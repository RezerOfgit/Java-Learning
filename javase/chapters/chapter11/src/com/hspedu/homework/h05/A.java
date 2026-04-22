package com.hspedu.homework.h05;

/**
 * @author Re-zero
 * @version 1.0
 */
public class A {
    private String name = "jack";
    public void f1(){
        class B{
            private String name = "tom";
            public void show(){
                System.out.println(name +"\n" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}

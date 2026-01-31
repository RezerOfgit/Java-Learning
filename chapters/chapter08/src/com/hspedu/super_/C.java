package com.hspedu.super_;

public class C extends B{
    public int n1 = 888;
    public void sum() {
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
}

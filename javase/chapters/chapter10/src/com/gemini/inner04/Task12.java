package com.gemini.inner04;

public class Task12 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show(300);
    }
}

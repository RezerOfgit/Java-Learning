package com.gemini.abstract_;

public class TestAbstract {
    public static void main(String[] args) {
        Template t1 = new Manager("jack");

        t1.calculateTime();

        Template t2 = new Worker("tom");

        t2.calculateTime();
    }
}

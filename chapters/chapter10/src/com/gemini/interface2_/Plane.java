package com.gemini.interface2_;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机发动引擎飞");
    }
}

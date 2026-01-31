package com.gemini.interface2_;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("鸟儿挥动翅膀飞");
    }
}

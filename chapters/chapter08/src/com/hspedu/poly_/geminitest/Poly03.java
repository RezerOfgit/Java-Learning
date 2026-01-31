package com.hspedu.poly_.geminitest;

public class Poly03 {
    public static void main(String[] args) {
    Poly03 poly = new Poly03();
    poly.feed(new Cat01());
    poly.feed(new Dog01());
}

    public void feed(Animal01 a) {
        System.out.println("--- 发现一只动物 ---");

        // 1. 如果 a 是一只猫 (Cat)
        if (a instanceof Cat01) {
            System.out.println("检测到是猫，准备喂鱼...");
            // 2. 向下转型，准备抓老鼠
            Cat01 cat = (Cat01) a;
            cat.catchMouse(); // 只有猫能抓老鼠
        }
        // 3. 如果 a 是一只狗 (Dog)
        else if (a instanceof Dog01) {
            System.out.println("检测到是狗，准备喂骨头...");
            // 4. 向下转型，准备看门
            Dog01 dog = (Dog01) a;
            dog.watchDoor(); // 只有狗能看门
        }
    }
}

    class Animal01 {}
    class Cat01 extends Animal01 {
        public void catchMouse() { System.out.println("猫抓老鼠"); }
    }
    class Dog01 extends Animal01 {
        public void watchDoor() { System.out.println("狗看门"); }
    }


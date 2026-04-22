package com.hspedu.extend_.improve_;

public class Extends03 {
    public static void main(String[] args) {
        Cat cat = new Cat("小花", 3);
        cat.showInfo();
        cat.cry();

       Dog dog = new Dog("大黄", 5);
        dog.showInfo();
        dog.watchDoor();
    }

}
class Animal{
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showInfo(){
        System.out.println("我是 " + name + "今年" + age + "岁");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void cry(){
        System.out.println("喵喵叫");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void watchDoor(){
        System.out.println("看门中");
    }
}
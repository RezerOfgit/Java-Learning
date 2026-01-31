package com.hspedu.extend_;

public class Extends02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "小花";
        cat.age = 3;
        cat.showInfo();;
        cat.cry();

        Dog dog = new Dog();
        dog.name = "大黄";
        dog.age = 5;
        dog.showInfo();
        dog.watchDoor();
    }

}
class Animal{
    public String name;
    public int age;
    public void showInfo(){
        System.out.println("我是 " + name + "今年" + age + "岁");
    }
}
class Cat extends Animal {
    public void cry(){
        System.out.println("喵喵叫");
    }
}
class Dog extends Animal {
    public void watchDoor(){
        System.out.println("看门中");
    }
}
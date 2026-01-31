package com.rezero.generic_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小白", 5));
        arrayList.add(new Dog("小黑", 4));
        arrayList.add(new Dog("小花", 2));

        for (Object obj : arrayList) {
            //向下转型
            Dog dog = (Dog)obj;
            System.out.println(dog.getName() + " - " + dog.getAge());
        }
    }

}
class Dog{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog[name=" + name + ", age=" + age + "]";
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

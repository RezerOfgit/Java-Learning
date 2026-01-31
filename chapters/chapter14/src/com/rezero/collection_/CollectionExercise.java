package com.rezero.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Re-zero
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection dog = new ArrayList();

        dog.add(new Dog("小黑", 5));
        dog.add(new Dog("小白", 7));
        dog.add(new Dog("小花", 2));

        Iterator iterator = dog.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);
        }

        for (Object o : dog) {
            System.out.println("o = " + o);
        }
    }
}
class Dog{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "小狗的" + "name = " + name + ", age = " + age;
    }
}

package com.rezero.generic_.improve_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        //使用泛型解读
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 0bject
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("小白", 5));
        arrayList.add(new Dog("小黑", 4));
        arrayList.add(new Dog("小花", 2));

        for (Dog dog : arrayList) {
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

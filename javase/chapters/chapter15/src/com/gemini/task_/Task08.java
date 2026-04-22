package com.gemini.task_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task08 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog02> dogs = new ArrayList<>();
        List<SmallDog> smallDogs = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // 🟢 1. 测试 <? extends Animal> (只要是 Animal 或它的子孙)
        List<? extends Animal> list1;

        list1 = dogs;       // Case A: Yes
        //list1 = objects;    // Case B: No


        // 🔵 2. 测试 <? super Dog> (只要是 Dog 或它的祖先)
        List<? super Dog02> list2;

        list2 = animals;    // Case C: Yes
        //list2 = smallDogs;  // Case D: No
    }
}
// 类定义
class Animal {}
class Dog02 extends Animal {}
class SmallDog extends Dog02 {}

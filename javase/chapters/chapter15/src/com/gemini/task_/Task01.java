package com.gemini.task_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        // 1. 没有使用 <Dog>，默认为 Object
        ArrayList list = new ArrayList();

        list.add(new Dog());
        list.add(new Cat()); // ClassCastException

        // 2. 遍历
        for (Object o : list) {
            // 3. 以为里面都是 Dog，所以强转
            Dog dog = (Dog) o;
            System.out.println("汪汪叫");
        }
    }
}
class Dog {}
class Cat {}

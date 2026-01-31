package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Collection;

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
    // 注意：Dog 类没有重写 equals 方法！使用默认的 Object.equals
}

public class Review05 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("旺财")); // 放入一只旺财

        // 我又new了一只新的旺财，名字一样
        Dog newDog = new Dog("旺财");

        // 问：集合里包含这只新狗吗？
        boolean result = list.contains(newDog);

        System.out.println(result);//f
    }
}

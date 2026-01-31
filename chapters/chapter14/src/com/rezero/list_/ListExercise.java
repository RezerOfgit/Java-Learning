package com.rezero.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello0");
        list.add("world1");
        list.add("java2");
        list.add("你好3");
        list.add("世界4");
        list.add("name5");
        list.add("tom6");
        list.add("jack7");
        list.add(8);
        list.add(9);

        list.add(1, "韩顺平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6, "change");
        System.out.println("list = " + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj" + obj);

        }
    }
}

package com.rezero.homework.h05;

import java.util.TreeSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework05 {
    /*
下面代码运行会不会抛出异常，并从源码层面说明原因.【考察读源码+接口编程+动态绑定】
TreeSet treeSet = new TreeSet();
treeSet.add(new Person());
class Person{}
     */
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //分析源码
        //add 方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类
        //所以在底层 Comparable<? super K> k = （Comparable<? super K>） key;
        //即 把 Person转成 Comparable类型
        treeSet.add(new Person());// ClassCastException
    }
}
class Person /*implements Comparable */{
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}

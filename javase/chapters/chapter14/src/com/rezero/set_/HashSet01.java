package com.rezero.set_;

import java.util.HashSet;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //说明
        //1. 在执行 add 方法后, 会返回一个 boolean 值
        //2. 如果添加成功，返回 true,否则返回 false
        //3. 可以通过 remove 指定删除哪个对象
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Roes"));//T

        set.remove("john");
        System.out.println("set = " + set);//3个

        set = new HashSet();
        System.out.println("set = " + set);
        //4. HashSet不能加入相同的元素/数据?
        set.add("lucy");//添加成功
        set.add("lucy");//加入失败
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//OK
        System.out.println("set = " + set);

        //再加深一下,非常经典的面试题
        //看源码,做分析,即 add 到底发生了什么?=> 底层机制
        set.add(new String("hello"));//ok
        set.add(new String("hello"));//false
        System.out.println("set = " + set);
    }
}
class Dog{//定义了Dog类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog:"+ name;
    }
}

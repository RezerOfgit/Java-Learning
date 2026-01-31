package com.rezero.customgeneric;

/**
 * @author Re-zero
 * @version 1.0
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //下面代码输出什么？
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);//Integer
        apple.fly(new Dog());//Dog
    }
}

class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

//    public void eat(U u) {//错误
//    }

    public void run(M m) {
    }
}

class Dog {
}
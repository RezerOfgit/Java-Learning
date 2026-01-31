package com.homework.h10;

import com.hspedu.poly_.Dog;

/**
 * 10.编写Doctor类{name,age,job,gender,sal}
 * 相应的getter()和setter()方法，5个参数的构造器，
 * 写父类的equals()方法：public boolean equals(object obj)，
 * 并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
 */
public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 30, "doctor", '男', 15000);
        Doctor doctor2 = new Doctor("jack", 50, "doctor", '男', 15000);

        System.out.println(doctor1.equals(doctor2));
    }
}

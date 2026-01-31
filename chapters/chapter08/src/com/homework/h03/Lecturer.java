package com.homework.h03;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是讲师信息：");
        super.introduce();
    }
}

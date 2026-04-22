package com.homework.h03;

public class AssProfessor extends Teacher{
    public AssProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授信息：");
        super.introduce();
    }
}

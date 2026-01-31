package com.homework.h13;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String play(){
        return name + "爱玩游戏";
    }

    @Override
    public String toString() {
        return "姓名：" + name + "\n" +
                "年龄：" + age + "\n" +
                "性别：" + gender;
    }
}

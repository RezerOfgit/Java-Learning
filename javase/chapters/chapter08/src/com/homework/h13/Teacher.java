package com.homework.h13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, int age, char gender, int work_age) {
        super(name, age, gender);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }

    @Override
    public String play() {
        return getName() + "爱玩象棋";
    }

    @Override
    public String toString() {
        return "老师的信息：\n" +
                super.toString() + "\n" +
                "工龄：" + work_age;
    }
}

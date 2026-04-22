package com.homework.h13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, int age, char gender, String stu_id) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }

    @Override
    public String play() {
        return getName() + "爱玩足球";
    }

    @Override
    public String toString() {
        return "学生的信息：\n" +
                super.toString() + "\n" +
                "学号：" + stu_id;
    }
}

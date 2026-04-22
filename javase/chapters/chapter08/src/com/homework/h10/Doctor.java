package com.homework.h10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public boolean equals(Object obj) {
        // 1. 如果地址一样，肯定是同一个对象
        if (this == obj) {
            return true;
        }

        // 2. 判断类型并向下转型
        if (!(obj instanceof Doctor)) {
            return false;
        }

        // 3. 向下转型，获取 Doctor 的特有属性
        Doctor other = (Doctor) obj;

        // 4. 逐个比较属性 (假设所有属性都相等才算相等)
        // 注意：String类型用equals，基本数据类型用==
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.job.equals(other.job) &&
                this.gender == other.gender &&
                this.salary == other.salary;
    }
    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

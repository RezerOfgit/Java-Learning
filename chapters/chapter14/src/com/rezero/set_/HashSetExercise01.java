package com.rezero.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise01 {
    /*
    定义一个Employee类，该类包含：private成员属性name,age要求：
    1.创建3个Employee 对象放入 HashSet中
    2.当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
     */
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 15));
        hashSet.add(new Employee("tom", 30));
        hashSet.add(new Employee("jack", 15));

        System.out.println("hashSet = " + hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果name 和 age 值相同,则返回相同的hash值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

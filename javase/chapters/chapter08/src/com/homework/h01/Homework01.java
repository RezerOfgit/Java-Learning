package com.homework.h01;

/**
 * 1.定义一个Person类{name，age，job}，初始化Person对象数组，
 * 有3个person对象，并按照age从大到小进行排序，提示，使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 56, "teacher");
        persons[1] = new Person("smith", 5, "worker");
        persons[2] = new Person("marry", 30, "manager");

        //int[] ageArr = new int[persons.length];
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                }
            }
        }
        System.out.println("年龄从大到小排序的结果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].showInfo() + "\t");
        }
    }
}

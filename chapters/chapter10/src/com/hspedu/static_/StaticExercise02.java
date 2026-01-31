package com.hspedu.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is " +
                Person.getTotalPerson());
        //Number of total is 0

        Person p1 = new Person();
        System.out.println( "Number of total is "+
                Person.getTotalPerson());
        //Number of total is 1
    }
}
class Person {
    private static int id;
    private static int total = 0;

    public static int getTotalPerson() {
        id++;//非静态变量
        return total;
    }

    public Person() {
        total++;
        id = total;
    }
}
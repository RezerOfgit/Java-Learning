package com.rezero.string_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        Person p2 = new Person();
        p2.name = "jack";

        System.out.println(p1.name.equals(p2.name));//T
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "jack");//T

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);//F
    }

}
class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
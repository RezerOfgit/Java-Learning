package com.hspedu.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        Person[] perpsons = new Person[3];
        perpsons[0] = new Person("jack", 20);
        perpsons[1] = new Person("smith", 25);
        perpsons[2] = new Person("marry", 30);

        for (int i = 0; i < perpsons.length; i++) {
            System.out.println(perpsons[i].say());
        }
//        Person jack = new Person("jack", 20);
//        System.out.println(jack);
    }
}

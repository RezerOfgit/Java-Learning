package com.hspedu.poly_.geminitest;

public class Poly01 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        a.run();

        //a.catchMouse();
        Cat cat = (Cat) a;
        cat.catchMouse();

//        Animal b = new Dog();
//        Cat cat2 = (Cat) b;

        Object obj = "Hello"; // 向上转型 (String -> Object)
        Integer num = (Integer) obj; // 向下转型 (强转成 Integer)
    }
}

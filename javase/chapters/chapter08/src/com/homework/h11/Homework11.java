package com.homework.h11;
/**现有Person类，里面有方法run、eat，Student类继承了Person类，
 * 并重写了run方法，自定义了study方法，试写出对象向上转型和向下转型的代码，
 * 并写出各自都可以调用哪些方法，并写出方法输出什么？
 */
public class Homework11 {
    public static void main(String[] args) {
        //向上转型
        Person student = new Student();
        student.eat();
        student.run();

        Person person = (Person) student;
        student.eat();
        student.run();

        Student student1 = (Student) student;
        student1.run();
        student1.study();
    }
}

class Person {
    public void run() {
        System.out.println("person run");
    }

    public void eat() {
        System.out.println("person eat");
    }
}
class Student extends Person {
        public void run() {
            System.out.println("student run");
        }
        public void study() {
            System.out.println("student study..");
        }
}
package com.hspedu.override_;
//        3.在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 20);
        Student student = new Student("jack", 20, "123456", 90);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}

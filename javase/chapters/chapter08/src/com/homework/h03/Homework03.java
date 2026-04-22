package com.homework.h03;

/**
 * 3.编写老师类
 * （1）要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资salary”
 * （2）编写业务方法，introduce（），实现输出一个教师的信息。
 * （3）编写教师类的三个子类：教授类（Professor）、副教授类、讲师类。
 *  工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。
 *  在三个子类里面都重写父类的introduce（）方法。
 * （4）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。
 */
public class Homework03 {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("jack", 50, "Professor", 23000, 1.3);
        teachers[1] = new Teacher("tom", 45, "AssProfessor", 18000, 1.2);
        teachers[2] = new Teacher("marry", 36, "Lecturer", 14000, 1.1);
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].introduce();
        }
    }
}

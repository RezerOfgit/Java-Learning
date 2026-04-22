package com.hspedu.static_;

public class StaticExercise03 {
    public static void main(String[] args) {
        Person02.setTotalPerson(3);//3
        Person02.m();
        new Person02();//4
        Person02.m();
    }
}
class Person02 {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total){
        //this.total = total;//错误，静态变量中不可用this
        Person02.total = total;
    }
    public Person02() {
        total++;
        id = total;
    }
    public  static void m(){
        System.out.println(total);
    }
}
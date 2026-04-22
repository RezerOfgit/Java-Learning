package com.hspedu.poly_.polyarr_;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建1个Person对象、
        // 2个Student 对象和2个Teacher对象，统一放在数组中，并调用每个对象say方法

        Person[] people = new Person[5];
        people[0] =new Person("marry", 20);
        people[1] =new Student("jack", 18, 100);
        people[2] =new Student("smith", 19, 67);
        people[3] =new Teacher("scott", 30, 10000);
        people[4] =new Teacher("king", 40, 15000);

        //循环遍历多态数组，调用say()
        for (int i = 0; i < people.length; i++) {
            //people[i]编译类型是Person, 运行类型是根据实际情况由jvm来判断
            System.out.println(people[i].say());//动态绑定机制
            //使用类型判断 + 向下转型。
            if(people[i] instanceof Student){//判断person[i]的运行类型是不是Student
//                Student student = (Student)people[i];//向下转型
//                student.study();
                ((Student)people[i]).study();
                //people[i].study();
            }else if (people[i] instanceof Teacher){
                ((Teacher)people[i]).teach();
            }else if (people[i] instanceof Person){
            }else {
                System.out.println("你的类型有误，请检查...");
            }
        }
    }
}

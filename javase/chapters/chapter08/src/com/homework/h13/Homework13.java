//package com.homework.h13;
//
//public class Homework13 {
//    public static void main(String[] args) {
//        Person[] persons = new Person[4];
//        persons[0] = new Student("小明", 15, '男', "00023102");
//        persons[1] = new Student("小红", 16, '女', "00023122");
//        persons[2] = new Teacher("张飞", 30, '男', 5);
//        persons[3] = new Teacher("貂蝉", 25, '女', 2);
//
//        for (int i = 0; i < persons.length - 1; i++) {
//            for (int j = 0; j < persons.length - 1 - i; j++) {
//                if (persons[j].getAge() < persons[j + 1].getAge()){
//                    Person temp = persons[j];
//                    persons[j] = persons[j + 1];
//                    persons[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("年龄从大到小排序的结果");
//        for (int i = 0; i < persons.length; i++) {
//            System.out.print(persons[i].getName() + "：" +
//                    persons[i].getAge() + "。\t");
//        }
//
////        Teacher[] teachers = new Teacher[2];
////        Student[] students = new Student[2];
////        for (int i = 0; i < persons.length; i++) {
////            if (persons[i] instanceof Teacher){
////                for (int j = 0; j < teachers.length; j++) {
////                    teachers[j] = (Teacher)persons[i];
////                }
////            }else if (persons[i] instanceof Student){
////                for (int j = 0; j < students.length; j++) {
////                    students[j] = (Student) persons[i];
////                }
////            }
////        }
//
//        for (int i = 0; i < persons.length; i++) {
//            if ((persons[i].getName()).equals("张飞")) {
//                Teacher teacher = (Teacher) persons[i];
//                System.out.println("老师的信息：");
//                System.out.println("姓名：" + teacher.getName() + "\n年龄：" +
//                        teacher.getAge() + "\n性别：" + teacher.getGender() +
//                        "\n工龄：" + teacher.getWork_age());
//                teacher.teach();
//                teacher.play();
//            } else if ((persons[i].getName()).equals("小明")) {
//                Student student = (Student) persons[i];
//                System.out.println("------------------");
//                System.out.println("学生的信息：");
//                System.out.println("姓名：" + student.getName() + "\n年龄：" +
//                        student.getAge() + "\n性别：" + student.getGender() +
//                        "\n学号：" + student.getStu_id());
//                student.study();
//                student.play();
//            }
//        }
//    }
//}
package com.homework.h13;

public class Homework13 {
    public static void main(String[] args) {
        // 1. 初始化数据
        Person[] persons = new Person[4];
        persons[0] = new Student("小明", 15, '男', "00023102");
        persons[1] = new Student("小红", 26, '女', "00023122");
        persons[2] = new Teacher("张飞", 30, '男', 5);
        persons[3] = new Teacher("貂蝉", 25, '女', 2);

        // 2. 冒泡排序（你的排序逻辑是对的，保留）
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                // 注意：这里建议在Person类加一个getAge()，或者把age访问权限设为protected
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

        System.out.println("--- 排序后的结果 ---");

        // 3. 核心：统一遍历，调用封装好的方法
        for (int i = 0; i < persons.length; i++) {
            // 直接把人传进去，不需要关心他是谁，方法内部会处理
            printInfo(persons[i]);
        }
    }

    // --- 这就是题目第(8)点要求的代码，把混乱的逻辑抽离出来 ---
    // 形参是 Person，利用了多态
    public static void printInfo(Person p) {
        System.out.println("------------------");

        // 1. 打印基本信息 (建议在Student/Teacher类中重写toString()方法)
        // 如果你重写了toString，这里一行代码就搞定：
        System.out.println(p.toString());

        // 或者是你原本的笨办法（手动get），但不需要判断名字，只需要判断类型
        // System.out.println("姓名：" + p.getName() + ...);

        // 2. 打印玩什么 (题目要求play返回String，利用动态绑定机制)
        // 只要是Person子类，p.play() 会自动调用子类重写的方法
        System.out.println(p.play());

        // 3. 核心考点：调用特有方法 (向下转型)
        if (p instanceof Student) {
            // 判断是学生，转成学生，学习
            Student s = (Student) p;
            s.study();
        } else if (p instanceof Teacher) {
            // 判断是老师，转成老师，教书
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
}

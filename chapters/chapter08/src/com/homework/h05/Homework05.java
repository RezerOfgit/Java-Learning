package com.homework.h05;

/**
 * 5.设计父类一员工类。子类：工人类（Worker），农民类（Peasant），
 * 教师类（Teacher），科学家类(Scientist)，服务生类（Waiter）。
 * （1）其中工人，农民，服务生只有基本工资
 * （2）教师除基本工资外，还有课酬（元/天）
 * （3）科学家除基本工资外，还有年终奖
 * （4）编写一个测试类，将各种类型的员工的全年工资打印出来
 */
public class Homework05 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Worker("jack", 6000);
        employees[1] = new Waiter("marry", 5000);
        employees[2] = new Peasant("tom", 4500);
        employees[3] = new Teacher("jack", 5500, 120, 200);
        employees[4] = new Scientist("smith", 45000, 0);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Scientist) {
//                Scientist scientist = (Scientist) employees[i];
//                scientist.setBonus(250000);
                ((Scientist) employees[i]).setBonus(250000);
            }
            employees[i].annualSalary();
        }
    }
}

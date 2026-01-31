package com.homework.h05;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void annualSalary(){
        System.out.println(getName() + "是工人，年薪是：" +
                12 * getSalary() + "元");
    }
}

package com.homework.h05;

public class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void annualSalary() {
        System.out.println(getName() + "是农民，年薪是：" +
                12 * getSalary() + "元");
    }
}

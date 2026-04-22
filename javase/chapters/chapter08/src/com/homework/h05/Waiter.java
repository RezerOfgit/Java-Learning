package com.homework.h05;

public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void annualSalary() {
        System.out.println(getName() + "是服务员，年薪是：" +
                12 * getSalary() + "元");
    }
}

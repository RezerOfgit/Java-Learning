package com.homework.h04;

public class Worker extends Employee{
    public Worker(String name, double daySalary, double workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void totalSalary() {
        System.out.println("员工" + getName() + "的工资是" +
                getDaySalary() * getWorkDays() * getGrade());
    }
}

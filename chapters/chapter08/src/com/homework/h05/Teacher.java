package com.homework.h05;

public class Teacher extends Employee{
    private double daySalary;
    private double workDays;

    public Teacher(String name, double salary, double daySalary, double workDays) {
        super(name, salary);
        this.daySalary = daySalary;
        this.workDays = workDays;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getWorkDays() {
        return workDays;
    }

    public void setWorkDays(double workDays) {
        this.workDays = workDays;
    }

    @Override
    public void annualSalary() {
        System.out.println(getName() + "是教师，年薪是：" +
                (12 * getSalary() + daySalary * workDays) + "元");
    }
}

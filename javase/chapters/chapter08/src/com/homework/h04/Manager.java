package com.homework.h04;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double daySalary, double workDays, double grade, double bonus) {
        super(name, daySalary, workDays, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void totalSalary() {
        System.out.println("经理" + getName() + "的工资是" +
                (getDaySalary() * getWorkDays() * getGrade() + bonus));
    }
}

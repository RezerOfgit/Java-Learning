package com.homework.h04;

public class Employee {
    private String name;
    private double daySalary;
    private double workDays;
    private double grade;

    public Employee(String name, double daySalary, double workDays, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void totalSalary(){
        System.out.println("员工" + name + "的工资是" +
                daySalary * workDays * grade);
    }
}

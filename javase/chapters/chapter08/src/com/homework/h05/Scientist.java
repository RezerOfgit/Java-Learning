package com.homework.h05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void annualSalary() {
        System.out.println(getName() + "是科学家，年薪是：" +
                (12 * getSalary() + bonus) + "元");
    }
}

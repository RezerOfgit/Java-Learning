package com.hspedu.abstract_;

public class Manager extends Employee{
    private double bonus;

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

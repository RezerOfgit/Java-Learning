package com.hspedu.poly_.polyparameter_;

public class RegularEmployee extends Employee{
    public RegularEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工 " + getName() + " is working");
    }
    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

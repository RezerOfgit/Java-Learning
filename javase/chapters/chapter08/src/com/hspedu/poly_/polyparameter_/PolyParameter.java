package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("jack", 10000);
        employees[1] = new RegularEmployee("smith", 12000);
        employees[2] = new Manager("marry", 20000, 50000);

        showEmpAnnual(employees[1]);
        showEmpAnnual(employees[2]);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getAnnual());
            if (employees[i] instanceof RegularEmployee) {
                ((RegularEmployee) employees[i]).work();
            } else if (employees[i] instanceof Manager) {
                ((Manager) employees[i]).manage();
            } else {
                System.out.println(employees[i].getName() +
                        "不是普通员工也不是经理，年薪是" + employees[i].getAnnual());
            }
        }
    }
    public static void showEmpAnnual(Employee e){
        System.out.println(e.getName() + "的年薪是" + e.getAnnual());
    }
}

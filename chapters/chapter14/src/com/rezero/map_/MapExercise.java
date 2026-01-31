package com.rezero.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(123, new Employee("jack", "123", 20000));
        hashMap.put(456, new Employee("tom", "456", 30000));
        hashMap.put(789, new Employee("smith", "789", 7800));

        Set entrySet = hashMap.entrySet();
        //遍历 2种方式
        //迭代器
        System.out.println("----第1种 迭代器----");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry = iterator.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
            Employee employee = (Employee) m.getValue();
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
        //增强For
        System.out.println("----第2种 增强For----");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
            Employee employee = (Employee) m.getValue();
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
    }
}
class Employee{
    private String name;
    private String id;
    private double sal;

    @Override
    public String toString() {
        return "Employee:" + name + "," + id + "," + sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee(String name, String id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
}

package com.rezero.generic_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class GenericExercise02 {
    public static void main(String[] args) {

        // 1. 【第一步】先定义比较器 (裁判)
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                // 先按照 name 排序
                if (!emp1.getName().equals(emp2.getName())) {
                    return emp1.getName().compareTo(emp2.getName());
                }
                // name 相同，按照生日排序
                // 注意：这里前提是你的 MyDate 类已经实现了 Comparable 接口
                // 或者你要在这里写完整的日期比较逻辑
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        };

        // 2. 【第二步】创建 TreeSet 时，把比较器传进去！
        // 告诉 TreeSet：“请用我指定的这个裁判规则来排序和去重”
        TreeSet<Employee> employees = new TreeSet<>(comparator);

        // 3. 【第三步】添加数据 (这时候 TreeSet 就会自动调用上面的 compare 方法了)
        employees.add(new Employee("jack", 8000, new MyDate(2000, 11, 05)));
        employees.add(new Employee("tom", 9000, new MyDate(2001, 5, 18)));
        employees.add(new Employee("smith", 18000, new MyDate(1996, 2, 29)));

        // 这条重复数据会被自动过滤掉，因为 compare 会返回 0
        employees.add(new Employee("jack", 18000, new MyDate(2000, 11, 05)));

        System.out.println("==== 结果 (自动排序且去重) ====");
        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "员工姓名: " + name + ", 薪资: " + sal +
                ", 生日: " + birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    @Override
    public int compareTo(MyDate o) {
        // 技巧：先比年
        int yearMinus = this.year - o.year;
        if (yearMinus != 0) return yearMinus;

        // 年相同，比月
        int monthMinus = this.month - o.month;
        if (monthMinus != 0) return monthMinus;

        // 月相同，比日
        return this.day - o.day;

    }

    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("非法日期: " +
                    year + "-" + month + "-" + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    //校验日期是否合法
    private boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(year, month)) {
            return false;
        }
        return true;
    }

    //获取某年某月的最大天数(考虑闰年)
    private int getDaysInMonth(int year, int month) {
        //1. 定义标准天数表(索引0是占位符,2月默认填28)
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //2. 特殊判断:如果是闰年的2月,强行返回29
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        //3. 替他情况,查表
        return days[month];
    }

    //判断是否为闰年
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getYear() {
        return year;
    }

    //校验年份
    public void setYear(int year) {
        if (!isValidDate(year, this.month, this.day)) {
            throw new IllegalArgumentException("非法年份: " + year);
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    //校验月份
    public void setMonth(int month) {
        if (!isValidDate(this.year, month, this.day)) {
            throw new IllegalArgumentException("非法月份: " + month);
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalArgumentException("非法日期: " + day);
        }
        this.day = day;
    }
}
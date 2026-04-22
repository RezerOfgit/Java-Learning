package com.rezero.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise02 {
    /*
    定义一个Employee类，该类包含：private成员属性name,sal,birthday
    (MyDate类型),其中birthday为MyDate类型(属性包括：year,month,day),
    要求：1.创建3个Employee放入 HashSet中
    2.当name和birthday的值相同时，认为是相同员工，不能添加到HashSet集合中
     */
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

//        MyDate myDate = new MyDate(1997, 10, 20);
//        MyDate myDate02 = new MyDate(2001,8,20);
//        hashSet.add(new Employee02("jack",8500,myDate));
//        hashSet.add(new Employee02("tom",10000,myDate02));
//        hashSet.add(new Employee02("jack",8500,myDate));

        hashSet.add(new Employee02("jack",8500,new MyDate(1997,10,20)));
        hashSet.add(new Employee02("tom",10000,new MyDate(2001,8,20)));
        hashSet.add(new Employee02("jack",8500,new MyDate(1997,10,20)));

        System.out.println(hashSet);
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    //构造方法,带校验
    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("非法日期:" + year + "-" + month + "-" + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //校验日期是否合法
    private boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(year, month)){
            return false;
        }
        return true;
    }
    //获取某年某月的最大天数(考虑闰年)
    private int getDaysInMonth(int year, int month) {
        // 1. 定义标准天数表 (索引0是占位符，2月默认填28)
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 2. 特殊判断：如果是闰年的2月，强行返回29
        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        // 3. 其他情况，直接查表
        return days[month];
    }
//    private int getDaysInMonth(int year, int month){
//        switch (month) {
//            case 4: case 6: case 9: case 11:
//                return 30;
//            case 2:
//                return isLeapYear(year) ? 29 : 28;
//            default:
//                return 31;
//        }
//    }
    //判断是否为闰年
    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getYear() {
        return year;
    }
    //setter也需校验
    public void setYear(int year) {
        if (!isValidDate(year, this.month, this.day)) {
            throw new IllegalArgumentException("非法年份:" + year);
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (!isValidDate(this.year, month, this.day)) {
            throw new IllegalArgumentException("非法月份:" + month);
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalArgumentException("非法日期:" + day);
        }
        this.day = day;
    }
}
class Employee02{
    private String name;
    private double sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    public Employee02(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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
}
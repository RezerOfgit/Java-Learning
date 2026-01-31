package com.rezero.homework.h02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Re-zero
 * @version 1.0
 */
/*
使用ArrayList完成对对象Car{name，price}的各种操作
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        Car car3 = new Car("奔驰", 500000);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car);
        arrayList1.add(car2);

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car);
        arrayList2.add(car2);
        arrayList2.add(car3);

        ArrayList arrayList = new ArrayList();
        //1.add：添加单个元素
        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(car3);
        System.out.println("arrayList = " + arrayList);
        //2.remove：删除指定元素
        arrayList.remove(car2);
        System.out.println("arrayList = " + arrayList);
        //3.contains：查找元素是否存在
        System.out.println(arrayList.contains(car2));
        //4.size：获取元素个数
        System.out.println(arrayList.size());
        //5.isEmpty：判断是否为空
        System.out.println(arrayList.isEmpty());
        //6.clear：清空
//        arrayList.clear();
//        System.out.println("arrayList = " + arrayList);
        //7.addAll：添加多个元素
        arrayList.addAll(arrayList1);
        System.out.println("arrayList = " + arrayList);
        //8.containsAll：查找多个元素是否都存在
        System.out.println(arrayList.containsAll(arrayList1));
        //9.removeAll：删除多个元素
//        arrayList.removeAll(arrayList2);
//        System.out.println("arrayList = " + arrayList);
        //使用增强for和 选代器来遍历所有的car，需要重写Car的toString方法
        System.out.println("====增强For====");
        for (Object obj : arrayList) {
            Car cars = (Car)obj;
            System.out.println(cars);
        }
        System.out.println("====迭代器====");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Car cars = (Car)next;
            System.out.println(cars);
        }

    }

}
class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "汽车品牌:" + name + ", 价格:" + price;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
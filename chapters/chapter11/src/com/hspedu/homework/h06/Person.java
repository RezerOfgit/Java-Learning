package com.hspedu.homework.h06;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //实例化Person对象”唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
    //这里涉及到一个编程思路，就是可以把具体的要求，封装成方法->这里就是编程思想
    public void passRiver(){
        //先得到船
        //如何防止始终使用的是传入的马 instanceOf
        //if (vehicles == null){
        //vehicles instanceof Boat 是判断 当前的 vehicles 是不是Boat
        //(1) vehicles = null : vehicles instanceof Boat -> false
        //(2) vehicles = 马对象 : vehicles instanceof Boat -> false
        //(3) vehicles = 船对象 : vehicles instanceof Boat -> true
        if (!(vehicles instanceof Boat)){
            //这里使用的是多态
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //得到马
        //判断一下,当前的 vehicles 属性是否已经存在了
        //if (vehicles == null){
        if (!(vehicles instanceof Horse)){
            //这里使用的是多态
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}

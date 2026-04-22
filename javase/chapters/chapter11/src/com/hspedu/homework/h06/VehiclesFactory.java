package com.hspedu.homework.h06;

/**
 * @author Re-zero
 * @version 1.0
 */
public class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse horse = new Horse();
    //创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    //这里将方法做成static
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}

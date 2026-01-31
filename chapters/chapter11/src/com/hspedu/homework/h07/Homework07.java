package com.hspedu.homework.h07;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(45);
        car.getAir().flow();
        Car car02 = new Car(20);
        car.getAir().flow();
        Car car03 = new Car(-10);
        car.getAir().flow();
        Car car04 = new Car(4);
        car.getAir().flow();
    }
}

package com.hspedu.homework.h01;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Car {
    double price = 10;
    static String color = "white";

    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}



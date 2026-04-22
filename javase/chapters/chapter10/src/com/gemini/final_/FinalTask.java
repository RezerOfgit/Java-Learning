package com.gemini.final_;

public class FinalTask {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.print("半径 = " + circle.getRadius() +
                "的圆的面积 = " + circle.calArea());
    }
}
final class Circle{
    private double radius;
    private final static double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calArea(){
        return PI * radius * radius;
    }
}
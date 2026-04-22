package com.hspedu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.area();
    }
}
class Circle{
    private double radius;
//    private final double PI = 3.14;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }

//    private final double PI;
//    public Circle(double radius){
//        PI = 3.14;
//        this.radius = radius;
//    }
    private final double PI;
    {
        PI = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area(){
        System.out.println("半径 = " + radius + "的圆面积 = " + PI * radius *radius);
    }
}
package com.homework.h09;

/**
 * 9.设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint，其
 * 构造器接受一一个标签值和x,y坐标，比如：
 * newLabeledPoint（“BlackThursday”，1929，230.07），写出对应的构造器即可
 */
public class Homework09 {
    public static void main(String[] args) {
        new LabeledPoint("BlackThursday",1929,230.07);
    }
}
class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
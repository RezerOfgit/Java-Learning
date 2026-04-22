package com.gemini.mymath_;

public class test02 {
    public static void main(String[] args) {
        MyMath.resSum(10, 5);
        MyMath.resMinus(10, 3);
    }
}
class MyMath{
    private double sum;
    private double minus;

    public static void resSum(double num1, double num2){
        System.out.println("两数之和 = " + (num1 + num2));
    }

    public static void resMinus(double num1, double num2){
        System.out.println("两数之差 = " + (num1 - num2));
    }
}
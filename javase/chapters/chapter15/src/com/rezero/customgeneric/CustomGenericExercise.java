package com.rezero.customgeneric;

/**
 * @author Re-zero
 * @version 1.0
 */
public class CustomGenericExercise {
    public static void main(String[] args) {
        //T = Double, R = String, M = Integer
        Tiger<Double, String, Integer> g = new Tiger<>("john");
        g.setT(10.9);//OK
        //g.setT("yy"); //错误,类型不对
        System.out.println(g);
        Tiger g2 = new Tiger("john~~");//OK,T = Object, R = Object, M = Object
        g2.setT("yy"); //OK,因为"yy" = String 是Object的子类
        System.out.println("g2=" + g2);
    }
}

package com.rezero.wrapper_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
    }

    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//F

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//T

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//F
    }
}

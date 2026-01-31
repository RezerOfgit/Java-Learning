package com.rezero.string_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F
        System.out.println(a == b.intern());//T
        System.out.println(b == b.intern());//F
    }
}

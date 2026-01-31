package com.rezero.string_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "java";
        String s5 = "abcdjava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6);//T
        System.out.println(s5.equals(s6));//T
    }
}

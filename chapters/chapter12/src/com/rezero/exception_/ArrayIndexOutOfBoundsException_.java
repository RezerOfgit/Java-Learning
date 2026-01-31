package com.rezero.exception_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[4]);
        }
    }
}

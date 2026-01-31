package com.hspedu.debug_;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        //debug源码
        int[] arr = {8, -1, 199, 70, 10};
        //排序，追入sort的源码
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
    }
}

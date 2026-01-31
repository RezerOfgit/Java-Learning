package com.gemini.supplement_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // 比较它们的类类型
        System.out.println(list1.getClass() == list2.getClass());
    }
}

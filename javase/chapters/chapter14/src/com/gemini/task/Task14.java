package com.gemini.task;

import java.util.HashSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("john");
        hashSet.add("smith");
        for (int i = 0; i < 10; i++) {
            System.out.println(hashSet);
        }
    }
}

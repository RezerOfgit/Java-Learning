package com.gemini.task;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task13 {
    public static void main(String[] args) {
        Set set = new HashSet();
        boolean b1 = set.add("Jack"); // 第 1 次T
        boolean b2 = set.add("Tom");
        boolean b3 = set.add("Jack"); // 第 2 次F
        set.add(null);//T
        set.add(null);//F
    }
}

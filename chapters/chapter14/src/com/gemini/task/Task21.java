package com.gemini.task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task21 {
    public static void main(String[] args) {
        // 1. 使用普通 HashSet
        Set set1 = new HashSet();
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Orange");
        System.out.println("set1 = " + set1);//不确定
        // 假设 "Apple" 的哈希值最小，"Banana" 最大 (这只是假设，实际看HashCode)
        // 这里的输出顺序是不确定的

        // 2. 使用 LinkedHashSet
        Set set2 = new LinkedHashSet();
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Orange");

        System.out.println("Set2: " + set2);//按照顺序
    }
}

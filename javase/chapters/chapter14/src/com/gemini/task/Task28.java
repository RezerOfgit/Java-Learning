package com.gemini.task;
import java.util.TreeSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task28 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("a"); // 重复添加

        System.out.println(set);
    }
}

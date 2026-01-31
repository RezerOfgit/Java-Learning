package com.gemini.task;
import java.util.Comparator;
import java.util.TreeSet;
/**
 * @author Re-zero
 * @version 1.0
 */
public class Task29 {
    public static void main(String[] args) {
        // 🔴 在构造器里传入一个“裁判”
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                // 要求：按长度从小到大排序
                // 提示：用 s1的长度 减去 s2的长度
                return s1.length() - s2.length();
            }
        });

        set.add("jack"); //  (长度4)
                set.add("tom"); //   (长度3)
                set.add("alice"); // (长度5)

                System.out.println(set);
    }
}

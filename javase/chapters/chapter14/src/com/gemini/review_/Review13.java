package com.gemini.review_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review13 {
    public static void main(String[] args) {
        //Set.add() 的返回值逻辑，常被用于判断去重。
        // 题目： 请写出下面代码的输出结果：
        Set set = new HashSet();
        set.add("A");
        boolean b1 = set.add("B");
        boolean b2 = set.add("A"); // 再次添加 A

        System.out.println(b1); // 输出: T
        System.out.println(b2); // 输出: F
    }
}

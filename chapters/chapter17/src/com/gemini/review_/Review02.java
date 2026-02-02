package com.gemini.review_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 * 请看下面的代码，它的运行结果是什么？ A. 成功删除 "B"，打印 [A, C]
 * B. 报错 ConcurrentModificationException
 * C. 报错 IndexOutOfBoundsException D. 编译错误
 */
public class Review02 {//A
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 试图在遍历中删除 "B"
        for (String s : list) {
            if ("B".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
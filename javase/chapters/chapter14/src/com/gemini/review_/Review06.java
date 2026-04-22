package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Review06 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1); // 索引0: 存放整数 1
        list.add(2); // 索引1: 存放整数 2
        list.add(3); // 索引2: 存放整数 3

        // 目标：我想删除 "2" 这个数字
        // 陷阱：这里传的是 int 类型的 1
        list.remove(1);

        System.out.println(list);//1,3
    }
}
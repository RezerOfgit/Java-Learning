package com.rezero.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Re-zero
 * @version 1.0
 */
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //解读
        //1. 使用增强for, 在CoLlection集合
        //2. 增强for, 底层仍然是迭代器
        //3. 增强for可以理解成就是简化版本的 迭代器遍历
        //4. 快捷键方式 I
        for (Object book : col) {
            System.out.println("book = " + book);
        }

//        //增强for,也可以直接在数组使用
//        int[] nums = {1, 4, 8, 10};
//        for (int i : nums){
//            System.out.println("i = " + i);
//        }
    }
}

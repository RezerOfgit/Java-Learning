package com.rezero.list_;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List 接口的实现子类 ArrayList, Vector, LinkedList
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();

        list.add("jack");
        list.add("tom");
        list.add("北京烤鸭");
        list.add("鱼香肉丝");

        //遍历
        //1. 迭代器
        System.out.println("====Iterator迭代器====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }

        //2. 增强For
        System.out.println("====增强For====");
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //3. 普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象 = " + list.get(i));
        }
    }
}

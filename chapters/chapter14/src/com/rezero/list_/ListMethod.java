package com.rezero.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //1. void add (int index，Objectele):在index位置插入ele元素
        // 在index = 1的位置插入一个对象
        list.add(1, "刘备");
        System.out.println("list = " + list);

        //2. boolean addAll(int index,Collection eles):从index位置开始将
        //   eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list = " + list);

        //3. Object get(int index):获取指定index位置的元素
        System.out.println(list.get(2));

        //4. int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//2

        //5. int lastindexOf(Object obj):返回obj在当前集合中末次出现的位置
        list.add("刘备");
        System.out.println("list = " + list);
        System.out.println(list.lastIndexOf("刘备"));//5

        //6. Object remove(int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list = " + list);

        //7. Object set(int index,Object ele):设置指定index位置的元素为ele,
        //   相当于是替换
        list.set(1, "mary");
        System.out.println("list = " + list);

        //8. List subList(int fromlndex,int toIndex)：返回从fromIndex到
        //   tolndex位置的子集合 [fromIndex,toIndex)
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist = " + returnlist);
    }
}

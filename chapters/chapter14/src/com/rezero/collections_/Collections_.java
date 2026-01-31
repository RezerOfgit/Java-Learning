package com.rezero.collections_;

import com.rezero.list_.ArrayListSource;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        //创建ArrayList 集合，用于测试.
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        //list.add("tom");
        System.out.println("list = " + list);

        //reverse(list)：反转List中元素的顺序
        Collections.reverse(list);
        System.out.println("list = " + list);

        //shuffle(list)：对 List集合元素进行随机排序
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("list = " + list);
//        }

        //sort(list)：根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println("自然排序结果:" + list);

        //sort(List,Comparator)：根据指定的Comparator产生的顺序对
        // List集合元素进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("按照字符串长度排序:" + list);

        //swap(list，int，int)：将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list, 0, 1);
        System.out.println("交换后:" + list);

        //Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然排序最大元素 = " + Collections.max(list));

        //Objectma(Collection, Comparator):根据Comparator 指定的顺序，
        // 返回给定集合中的最大元素
        // 比如返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("长度最大的元素" + maxObject);

        //Object min(Collection)
        //Object min(Collection,Comparator),参考max

        //int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        System.out.println("tom出现的次数 = " + Collections.frequency(list, "tom"));

        //void copy(List dest,List src)：将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整复制,需要先给dest赋值,大小和list.size()一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest = " + dest);

        //boolean replaceAll(List list, Object oldVal, Object newVal):使用
        //新值替换List对象的所有旧值
        //如果list中,有tom 就替换成 汤姆
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("list替换后= " + list);
    }
}

package com.rezero.map_;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book02("",100));//OK
        map.put("邓超","孙俪");//替换->分析源码
        map.put("王宝强","马蓉");//OK
        map.put("宋喆","马蓉");//OK
        map.put("刘令博",null);//OK
        map.put(null,"刘亦菲");//OK
        map.put("鹿晗","关晓彤");//OK

        //第一组:先取出 所有的Key ,通过Key 取出对应的Value
        Set keySet = map.keySet();
        //(1) 增强For
        System.out.println("----第一种 增强For----");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2) 迭代器
        System.out.println("----第二种 迭代器----");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组: 把所有的values 取出
        Collection values = map.values();
        //这里可以使用所有的Collections使用的遍历方法
        //(1) 增强For
        System.out.println("----取出所有的value 增强For----");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2) 迭代器
        System.out.println("----取出所有的value 迭代器----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组:通过EntrySet 来获取k- v
        Set entrySet = map.entrySet();
        //(1) 增强For
        System.out.println("----使用EntrySet 的 增强For(第3种)----");
        for (Object entry : entrySet) {
            //将entry 转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //(2) 迭代器
        System.out.println("----使用EntrySet 的 迭代器(第4种)----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            //System.out.println(next.getClass());//HashMap$Node -实现-> Map.Entry (getKey,getValue)
            //向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}

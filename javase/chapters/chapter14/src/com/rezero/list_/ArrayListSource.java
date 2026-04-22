package com.rezero.list_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //解读源码
        //注意 IDEA默认情况下,debug显示的数据是简化后的,如果希望看到
        //完整的数据需要做设置

        //使用无参构造器创建ArrayList对象
        //ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(8);
        //使用for给list集合添加 1-10数据
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        //使用for给list集合添加11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}

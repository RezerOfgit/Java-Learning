package com.gemini.task;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task10 {
    /*
    题目： 假设有一个 ArrayList，内部数组存储如下：
    [ "A", "B", "C", "D", "E" ] (Size = 5) 索引: 0 1 2 3 4
    现在执行 list.remove(1) (删掉 "B")。 请描述在底层数组中，
    为了填补 "B" 的空缺，哪些元素需要移动？

    "C" 移动到索引 1
    "D" 移动到索引 2
    "E" 移动到索引 3
    原先索引 4 的位置（原来是 "E"）最后会变成什么？null
    (提示：源码中会把它置为 null 以便 GC 回收)

     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}

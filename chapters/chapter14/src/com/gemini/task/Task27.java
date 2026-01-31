package com.gemini.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task27 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        // 1. 反转：把列表倒过来 [milan, king, smith, tom]
        Collections.reverse(list);

        // 2. 乱序：像洗牌一样随机打乱顺序
        Collections.shuffle(list);

        // 3. 排序：按自然顺序(a-z) 升序排列
        Collections.sort(list);

        // 4. 交换：把第0个和第1个元素换位置
        Collections.swap(list, 0, 1);
    }
}

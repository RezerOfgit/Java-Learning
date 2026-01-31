package com.gemini.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task19 {
    /*
    Task 19：只找钥匙 (KeySet 遍历)
对应进度：P531 (Map遍历方式1) 背景： 这是最简单的遍历方式：
先拿到所有的 Key（把所有男人的名字记在一个 Set 本子上），
然后通过 Key 去找 Value。
题目： 请补全代码，打印出所有的 Key-Value。
     */
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("吴京", "谢楠");

// 1. 获取所有的 Key (返回一个 Set)
        Set keys = map.keySet();

// 2. 遍历 Key
        for (Object key : keys) {
             //3. 通过 Key 找 Value
            Object value = map.get(key);
            System.out.println(key + "-" + value);
        }
    }
}

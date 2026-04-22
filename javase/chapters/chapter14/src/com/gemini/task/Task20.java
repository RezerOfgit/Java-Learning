package com.gemini.task;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task20 {
    /*
    Task 20：结婚证遍历 (EntrySet 遍历) 🔥重点
对应进度：P532 (Map遍历方式2) 背景：
KeySet 遍历需要跑两趟（先拿 Key，再回 Map 查 Value），效率低。
EntrySet 是把 Key 和 Value 捆绑成一个对象（叫 Entry，类似于“结婚证”或“节点”），
直接遍历这个对象，效率最高。

题目： 请补全代码（注意类型转换，这是 EntrySet 最麻烦的地方）。
     */
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("吴京", "谢楠");
// ... map初始化同上 ...

// 1. 获取所有的 Entry (结婚证集合)
        Set entrySet = map.entrySet();

        for (Object obj : entrySet) {
            // 🔴 关键点：向下转型！
            // Entry 是 Map 接口里的一个内部接口，全名是 Map.Entry
            Map.Entry entry = (Map.Entry) obj;

            // 2. 直接从结婚证里拿 Key 和 Value
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + "-" + value);
        }
    }
}

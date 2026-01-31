package com.gemini.supplement_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement05 {
    /*
    Supplement 05：Entry 到底是个啥？(Debug)
目标：亲眼看看 entrySet 里存的那个 Map.Entry 对象，
到底是不是我们之前在 HashSet 里见过的 Node？
操作：

1.写一段代码遍历 entrySet。
2.在 Map.Entry entry = (Map.Entry) obj; 这一行打断点。
3.Debug 运行。
4.观察： 看 entry 这个变量的实际类型（大括号 {} 前面的类型）。
它是 java.util.Map.Entry 还是 java.util.HashMap$Node？
是java.util.HashMap$Node
(这能帮你打通 Map 和 Set 的任督二脉！)
     */
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "rezero");//k-v
        map.put("no2", "张无忌");//k-v

        Set entrySet = map.entrySet();

        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

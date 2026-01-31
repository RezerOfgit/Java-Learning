package com.gemini.supplement_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement06 {
    /*
    目标：亲眼看到 LinkedHashSet 里的节点多了 before 和 after 两个指针。
    操作步骤：

1.写一行代码：Set set = new LinkedHashSet(); set.add("A"); set.add("B");
2.Debug 运行。
3.展开 set -> map -> table。
4.找到存 "A" 的那个节点。
5.观察： 普通的 HashMap$Node 只有 next（处理冲突用的）。
但 LinkedHashSet 里的节点（实际是 LinkedHashMap$Entry）多了两个属性：
    before
    after
    请看看 "A" 的 after 是不是指向了 "B"？
     */
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("A");
        set.add("B");
    }
}

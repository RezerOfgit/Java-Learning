package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement11 {
    /*
    Debug 思考题： 接着 Task 29 的逻辑。
    如果我们再执行一句：set.add("bob"); (长度也是 3，和 "tom" 一样长)。

"bob" 能加进去吗？No

为什么？(因为 Comparator 只看长度，不看内容)
Set 的去重不一定只靠 equals，TreeSet 是靠 Comparator 返回 0
     */
}

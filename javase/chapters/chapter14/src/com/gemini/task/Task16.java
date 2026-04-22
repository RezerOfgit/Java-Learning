package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task16 {
    /*
    假设有一个 Person 类。 请分析以下 4 种情况，执行 set.add(p2) 时，
    p2 能不能加进去（会不会被判定为重复）？
情况   p1 和 p2 的         p1.equals(p2)  p2 能加进去吗?      备注
      哈希值 (hashCode)      的结果        (Yes/No)       (底层发生了什么)

1    不同 (100 vs 200)      false           Yes          住在不同的房间，互不干扰
2    相同 (100 vs 100)      true            No          (A) 哈希一样，内容也一样
3    相同 (100 vs 100)      false           Yes         (B) 哈希冲突了，但内容不同
4    不同 (100 vs 200)      true            No          (C) 这在逻辑上是不应该发生的(违反规约)，
                                                            但在代码里如果发生了...
     */
}

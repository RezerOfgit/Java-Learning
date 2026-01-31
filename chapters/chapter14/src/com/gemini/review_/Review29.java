package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review29 {
    /*
    考察点：刚刚总结的文章案例二。
    题目： 在 HashSet 中存入一个对象后，如果修改了该对象参与 hashCode 计算的属性值，
    再调用 remove 删除它，通常会返回 false（删除失败）。
    这是因为：修改属性后，对象的哈希值变了，remove 方法根据新的哈希值去寻找索引位置，
    结果发现那个位置是空的，或者即使找到了也不匹配。
     */
}

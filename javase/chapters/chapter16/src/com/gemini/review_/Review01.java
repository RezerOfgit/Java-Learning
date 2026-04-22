package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
/*
集合的选择：代码里使用了 Vector<EnemyTank> 而不是 ArrayList。
思考：为什么在这里用 Vector？
（提示：可以去搜一下 Vector 和 ArrayList 的区别，关键词是“线程安全”。
这对后面的多线程章节至关重要）。
Vector线程安全 因为要考虑多线程问题


// 假设 enemyTanks 里已经有了 3 个坦克对象
EnemyTank t1 = enemyTanks.get(0);
t1.setDirect(3); // 修改 t1 的方向
// 请问：enemyTanks 集合里存的那个坦克的方向变了吗？
选项：A. 变了 B. 没变

原因：因为 Java 集合存的是对象的______（引用/拷贝）？

A,引用
 */
}

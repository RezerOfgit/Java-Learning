package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review02 {
    /*
    假设你的面试官连发两问，请用最短的话秒杀他：
“小伙子，MySQL 8.0 默认的存储引擎是什么？它和 MyISAM 最大的两个区别是什么？”
默认引擎：InnoDB。
两个最大区别：
1.InnoDB 支持事务，MyISAM 不支持
2.InnoDB 支持行锁，MyISAM 只有表锁

“这个默认引擎的默认事务隔离级别是什么？它能解决幻读问题吗？”
默认隔离级别：可重复读（REPEATABLE READ）。
能解决幻读，靠的是 MVCC + Next-Key Lock（临键锁），这是 InnoDB 特有的机制。
     */
}

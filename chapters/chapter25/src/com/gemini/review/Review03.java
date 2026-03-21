package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review03 {
    /*
你接手了前同事的一段烂代码，他基于一张 orders（订单表）创建了一个视图 v_order_summary，
创建语句里包含了 GROUP BY user_id 和 SUM(amount)。
现在前台业务要求你能通过网页直接修改用户的总消费金额。
你能在 Java 代码里写一条 UPDATE v_order_summary SET ... 去更新这个视图吗？为什么？

答案：不能。
原因： 视图包含 GROUP BY 和 SUM() 这类聚合操作时，它是不可更新视图。
正确做法:直接更新原始表 orders，视图会自动反映最新数据,视图本身只是一个虚拟表，
不存储数据，真正改的是底层 orders 表。
     */
}

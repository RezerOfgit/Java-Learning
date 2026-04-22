package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task12 {
    /*
    Task12 (架构思维：JDBC 事务三剑客)
在默认情况下，JDBC 执行一条 DML（增删改）语句就会立刻自动提交到数据库。为了把多个步骤绑定成一个完整的事务，我们必须调用 Connection 对象的三个核心方法。
请默写出这三个核心方法（提示：关闭自动提交、手动提交、回滚异常）。

1. 关闭自动提交
connection.setAutoCommit(false);

2. 手动提交
connection.commit();

3. 回滚（异常时）
connection.rollback();

     */
}

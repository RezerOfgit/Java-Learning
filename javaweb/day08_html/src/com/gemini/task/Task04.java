package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task04 {
    /*
    请在你的 DBeaver 中执行以下操作（写出对应的 SQL 语句）：

我们之前在 goods 表里经常根据商品名称（goods_name）进行模糊查询或精确查询。请为 goods_name 字段创建一个普通索引，索引名称定为 idx_goods_name。
假设我们需要查看 goods 表现在到底有哪些索引，请写出查看索引的 SQL 语句。
（选做/思考）：在真实的电商系统中，商品价格（price）和库存（stock_quantity）这俩字段，你觉得哪个更适合加索引？为什么？（用一句话简答）。

建议给 价格 (price) 字段加索引，因为价格是查询条件中的高频字段（如价格区间筛选），而库存字段更新频繁且值重复度高，索引维护成本高且收益低。
     */
}

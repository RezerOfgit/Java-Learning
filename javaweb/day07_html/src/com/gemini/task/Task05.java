package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    /*
    编写 SQL 语句：

在电商系统中，一个商品可以贴多个标签（如“双11特惠”、“清仓”），一个标签也可以用在多个商品上。这是标准的多对多关系。

请根据以下 ASCII 架构图，创建出对应的标签表 (tags) 和 中间关联表 (goods_tag_relation)。

Plaintext

+---------------+       +----------------------+       +---------------+
| goods         |       | goods_tag_relation   |       | tags          |
+---------------+       +----------------------+       +---------------+
| id (PK)       |<------| goods_id (FK)        |       | id (PK)       |
| goods_name    |       | tag_id   (FK)        |------>| tag_name      |
| ...           |       +----------------------+       +---------------+
+---------------+       (注: 中间表需设置联合主键)
创建 tags 表（id 主键自增，tag_name 标签名）。
创建 goods_tag_relation 表（包含 goods_id 和 tag_id，这两列既是联合主键，又分别是两张表的外键）。
     */
}

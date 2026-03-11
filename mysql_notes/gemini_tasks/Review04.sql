-- 背景：你出去面试，面试官看了看你昨天的 goods 表代码，嘴角微微上扬，给你挖了两个坑。
-- 
-- 需求 1 (简答计算)：在 utf8 编码下，你的 goods_name varchar(200) 
-- 如果只存了“联想电脑”这 4 个汉字，它在底层硬盘上究竟占用了多少个字节？（请列出你的计算公式，精准打消面试官的质疑！）
-- 4 * 3 + 1 = 13字节
-- 需求 2 (实战代码)：面试官要求你现场手写一段 SQL：“假设我现在想把 goods 表里的 price 字段，
-- 从 DECIMAL(8,2) 扩大成 DECIMAL(10,2)，并且要求默认值设为 0.00，这句修改表的指令该怎么写？”
ALTER TABLE `goods`
		MODIFY price decimal(10, 2)
		NOT NULL DEFAULT 0.00;
DESC GOODS ;
-- 考点：昨天的核心雷区（字节计算法）与 ALTER TABLE ... MODIFY 语法。
-- 多表查询的自连接
-- 思考题：显示公司员工和他的上级的名字
-- 
-- 分析：员工名字在emp，上级的名字的名字emp
-- 员工和上级是通过emp表的mgr列关联
-- 小结：自连接的特点
-- 1. 把同一张表当做两张表使用
-- 2. 需要给表取别名表名表别名
-- 3. 列名不明确，可以指定列的别名 列名 as 列的别名
SELECT worker.ename AS '职员名',boss.ENAME AS '上级名'
		FROM emp worker, emp boss
		WHERE worker.mgr = boss.empno;

SELECT * FROM EMP E ;

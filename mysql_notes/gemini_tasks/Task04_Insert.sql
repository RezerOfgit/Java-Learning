-- 1. 创建员工表(包含:编号, 姓名, 年龄, 职位)
CREATE TABLE emp (
	id int,
	name varchar(50),
	age int,
	job varchar(50)
);
-- 语法A：标准写法 (指名道姓，最安全)
-- 往 emp 表的 (id, name, age, job) 这几个列里，依次塞入后面的值。
INSERT INTO emp (id, name, age, job) VALUES (1001, 'IronMan', 40, 'CEO');

-- 语法B：偷懒写法 (省略列名，风险较高)
-- 不写列名时，后面的值必须和建表时的顺序、数量 100% 严丝合缝对齐！
INSERT INTO emp VALUES (1002, 'SpiderMan', 18, 'Student');

-- 查看 emp 表里的所有数据
SELECT * FROM emp;

-- 语法C：批量插入 (一次性塞入3个新员工，用逗号隔开！)
INSERT INTO emp (id, name, age, job) VALUES
(1003, 'Batman', 35, 'Boss'),
(1004, 'Superman', 30,'Reporter'),
(1005, 'WonderWoman', 800, 'Warrior');

-- 再次查看全表数据
SELECT * FROM emp ORDER BY id ASC;

-- 任务 1：把 SpiderMan 的年龄修改为 20 岁
UPDATE emp SET age = 20 WHERE name = 'Spiderman';

-- 任务 2：不仅可以改一个字段，还能同时改多个！
-- 把 Batman 的职位改成 'Super Boss'，并且年龄改成 40
UPDATE emp SET job = 'Super Boss', age = 40 WHERE name = 'Batman';

-- 最后查出来验货
SELECT * FROM emp ORDER BY id ASC ;

-- 开除名为 WonderWoman 的员工
DELETE FROM emp WHERE name = 'WonderWoman';

-- 查验结果
SELECT * FROM emp ORDER BY id ASC ;

-- 赋予 id 列“主键”身份，让它成为全表唯一的标识！
ALTER TABLE emp ADD PRIMARY KEY (id);

-- 再次查询全表
SELECT * FROM emp ORDER BY id ASC ;



















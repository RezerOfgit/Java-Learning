-- 删除数据库的表的语句
-- DROP DATABASE javaweb_db01;
-- CREATE DATABASE javaweb_db01;

-- 部门管理
create table dept(
    id int unsigned primary key auto_increment comment '主键ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';

insert into dept (id, name, create_time, update_time) values(1,'学工部',now(),now()),(2,'教研部',now(),now()),(3,'咨询部',now(),now()), (4,'就业部',now(),now()),(5,'人事部',now(),now());



-- 员工管理(带约束)
create table emp (
  id int unsigned primary key auto_increment comment 'ID',
  username varchar(20) not null unique comment '用户名',
  password varchar(32) default '123456' comment '密码',
  name varchar(10) not null comment '姓名',
  gender tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
  image varchar(300) comment '图像',
  job tinyint unsigned comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
  entrydate date comment '入职时间',
  dept_id int unsigned comment '部门ID',
  create_time datetime not null comment '创建时间',
  update_time datetime not null comment '修改时间'
) comment '员工表';

INSERT INTO emp
	(id, username, password, name, gender, image, job, entrydate,dept_id, create_time, update_time) VALUES
	(1,'jinyong','123456','金庸',1,'1.jpg',4,'2000-01-01',2,now(),now()),
	(2,'zhangwuji','123456','张无忌',1,'2.jpg',2,'2015-01-01',2,now(),now()),
	(3,'yangxiao','123456','杨逍',1,'3.jpg',2,'2008-05-01',2,now(),now()),
	(4,'weiyixiao','123456','韦一笑',1,'4.jpg',2,'2007-01-01',2,now(),now()),
	(5,'changyuchun','123456','常遇春',1,'5.jpg',2,'2012-12-05',2,now(),now()),
	(6,'xiaozhao','123456','小昭',2,'6.jpg',3,'2013-09-05',1,now(),now()),
	(7,'jixiaofu','123456','纪晓芙',2,'7.jpg',1,'2005-08-01',1,now(),now()),
	(8,'zhouzhiruo','123456','周芷若',2,'8.jpg',1,'2014-11-09',1,now(),now()),
	(9,'dingminjun','123456','丁敏君',2,'9.jpg',1,'2011-03-11',1,now(),now()),
	(10,'zhaomin','123456','赵敏',2,'10.jpg',1,'2013-09-05',1,now(),now()),
	(11,'luzhangke','123456','鹿杖客',1,'11.jpg',5,'2007-02-01',3,now(),now()),
	(12,'hebiweng','123456','鹤笔翁',1,'12.jpg',5,'2008-08-18',3,now(),now()),
	(13,'fangdongbai','123456','方东白',1,'13.jpg',5,'2012-11-01',3,now(),now()),
	(14,'zhangsanfeng','123456','张三丰',1,'14.jpg',2,'2002-08-01',2,now(),now()),
	(15,'yulianzhou','123456','俞莲舟',1,'15.jpg',2,'2011-05-01',2,now(),now()),
	(16,'songyuanqiao','123456','宋远桥',1,'16.jpg',2,'2007-01-01',2,now(),now()),
	(17,'chenyouliang','123456','陈友谅',1,'17.jpg',NULL,'2015-03-21',NULL,now(),now());

SELECT * FROM DEPT D ;
SELECT * FROM EMP E ;

-- 分页查询语法
-- 参数1: 起始索引 = (页码 - 1) * 每页展示记录数
-- 参数2: 查询返回记录数 = 每页展示记录数
select * from emp limit 0,5;

-- 查询第一页数据,每页展示5条记录
select * from emp limit 0,5;

-- 查询第二页数据,每页展示5条记录
select * from emp limit 5,5;

-- 查询第三页数据,每页展示5条记录
select * from emp limit 10,5;

-- 条件查询员工 - 姓名、性别、入职时间
SELECT
	*
FROM
	emp
WHERE
	name LIKE concat('%', '张', '%')
	AND gender = 1
	AND entrydate BETWEEN '2000-01-01' AND '2010-01-01'
ORDER BY
	update_time DESC;

-- 批量删除员工
DELETE FROM EMP WHERE id IN (1, 2, 3);

-- 更新员工
update emp 
SET 
	username = 'Tom1',
	password = '123456',
	`name` = '汤姆1',
	gender = 1,
	image = '1.jpg',
	job = 1,
	entrydate = '2005-01-01',
	dept_id = 1,
	update_time = '2022-01-01 00:00:00'
where id =1;

-- 登录
SELECT * FROM EMP 
		WHERE USERNAME = 'jinyong' AND PASSWORD = '123456';

CREATE TABLE `dept_log`(
	id int UNSIGNED PRIMARY KEY AUTO_INCREMENT comment 'ID',
	creat_time datetime NOT NULL comment '创建时间',
	`description` varchar(255) comment '问题描述'
) comment '部门操作日志表';

SELECT * FROM DEPT_LOG DL ;






















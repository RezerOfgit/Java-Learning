-- 部门管理
create table tb_dept(
    id int unsigned primary key auto_increment comment '主键ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';

insert into tb_dept (id, name, create_time, update_time) values(1,'学工部',now(),now()),(2,'教研部',now(),now()),(3,'咨询部',now(),now()), (4,'就业部',now(),now()),(5,'人事部',now(),now());



-- 员工管理
create table tb_emp (
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

INSERT INTO tb_emp
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

SELECT * FROM TB_DEPT TD ;
SELECT * FROM TB_EMP TE ;

-- 多表查询
SELECT * FROM  TB_EMP, TB_DEPT
		WHERE tb_emp.DEPT_ID = tb_dept.ID;



-- ============================= 内连接 ==========================
-- A. 查询员工的姓名 , 及所属的部门名称 (隐式内连接实现)
SELECT tb_emp.NAME, tb_dept.NAME FROM TB_EMP, TB_DEPT
		WHERE tb_emp.DEPT_ID = tb_dept.ID ;

-- 起别名
SELECT e.NAME, d.NAME FROM TB_EMP e, TB_DEPT d
		WHERE e.DEPT_ID = d.ID ;

-- B. 查询员工的姓名 , 及所属的部门名称 (显式内连接实现)
SELECT tb_emp.NAME, tb_dept.NAME 
		FROM tb_emp INNER JOIN tb_dept ON tb_emp.DEPT_ID = tb_dept.ID ;


-- =============================== 外连接 ============================
-- A. 查询员工表 所有 员工的姓名, 和对应的部门名称 (左外连接)
SELECT TE.NAME, TD.NAME FROM TB_EMP TE LEFT OUTER 
		JOIN TB_DEPT TD ON TE.DEPT_ID = TD.ID ;

-- B. 查询部门表 所有 部门的名称, 和对应的员工名称 (右外连接)
SELECT TD.NAME, TE.NAME FROM TB_EMP TE RIGHT OUTER 
		JOIN TB_DEPT TD ON TE.DEPT_ID = TD.ID ;

SELECT TD.NAME, TE.NAME FROM TB_DEPT TD LEFT OUTER 
		JOIN TB_EMP TE ON TE.DEPT_ID = TD.ID ;


-- ========================= 子查询 ================================
-- 标量子查询
-- A. 查询 "教研部" 的所有员工信息
-- a. 查询 教研部 的部门ID - tb_dept
SELECT id FROM TB_DEPT TD
		WHERE NAME = '教研部';

-- b. 再查询该部门ID下的员工信息 - tb_emp
SELECT * FROM TB_EMP TE 
		WHERE DEPT_ID = (SELECT id FROM TB_DEPT TD
		WHERE NAME = '教研部');

-- B. 查询在 "方东白" 入职之后的员工信息
-- a. 查询 方东白 的入职时间
SELECT ENTRYDATE FROM TB_EMP TE 
		WHERE NAME = '方东白';

-- b. 查询在 "方东白" 入职之后的员工信息
SELECT * FROM TB_EMP TE 
		WHERE ENTRYDATE > (SELECT ENTRYDATE FROM TB_EMP TE 
		WHERE NAME = '方东白');

-- 列子查询
-- A. 查询 "教研部" 和 "咨询部" 的所有员工信息
-- a. 查询 "教研部" 和 "咨询部" 的部门ID - tb_dept
SELECT ID FROM TB_DEPT TD 
		WHERE NAME = '教研部' OR NAME = '咨询部';

-- b. 根据部门ID, 查询该部门下的员工信息 - tb_emp
SELECT * FROM TB_EMP TE 
		WHERE DEPT_ID IN (SELECT ID FROM TB_DEPT TD 
		WHERE NAME = '教研部' OR NAME = '咨询部');

-- 行子查询
-- A. 查询与 "韦一笑" 的入职日期 及 职位都相同的员工信息 ;
-- a. 查询 "韦一笑" 的入职日期 及 职位
SELECT ENTRYDATE, JOB FROM TB_EMP TE 
		WHERE NAME = '韦一笑';

-- b. 查询与其入职日期 及 职位都相同的员工信息 ;
SELECT * FROM TB_EMP TE 
		WHERE ENTRYDATE = '2007-01-01'
		AND JOB = 2;

-- 方式一
SELECT * FROM TB_EMP TE 
		WHERE ENTRYDATE = (
			SELECT ENTRYDATE FROM TB_EMP TE WHERE NAME = '韦一笑'
		)AND JOB = (
			SELECT JOB FROM TB_EMP TE WHERE NAME = '韦一笑'
		);

-- 方式二
SELECT * FROM TB_EMP TE 
		WHERE (ENTRYDATE, JOB) = (
			SELECT ENTRYDATE, JOB FROM TB_EMP TE 
			WHERE NAME = '韦一笑');

-- 表子查询
-- A. 查询入职日期是 "2006-01-01" 之后的员工信息 , 及其部门名称
-- a. 查询入职日期是 "2006-01-01" 之后的员工信息
SELECT * FROM TB_EMP TE 
		WHERE ENTRYDATE > '2006-01-01';

-- b. 查询这部分员工信息及其部门名称 - tb_dept
SELECT e.*, d.NAME FROM (
		SELECT * FROM TB_EMP TE WHERE ENTRYDATE > '2006-01-01') e, TB_DEPT d
		WHERE e.dept_id = d.ID ;
































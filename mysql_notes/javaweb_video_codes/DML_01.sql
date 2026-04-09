-- DML : 数据操作语言
-- DML : 插入数据 - insert
-- 1. 为 tb_emp 表的 username, name, gender 字段插入值
insert into tb_emp(username,name,gender,create_time,update_time) 
		values ('wuji','张无忌',1,now(),now());


-- 2. 为 tb_emp 表的 所有字段插入值
insert into tb_emp(id, username, password, name, gender, image, job, entrydate, create_time, update_time)
            values (null,'zhiruo','123','周芷若',2,'1.jpg',1,'2010-01-01',now(),now());

insert into tb_emp values (null,'zhiruo2','123','周芷若',2,'1.jpg',1,'2010-01-01',now(),now());

-- 3. 批量为 为 tb_emp 表的 username , name , gender 字段插入数据
insert into tb_emp(username,name,gender,create_time,update_time) values
              ('weifuwang','韦一笑',1,now(),now()),('xieshiwang','谢逊',1,now(),now());

SELECT * FROM TB_EMP TE ;

-- DML : 更新数据 - update
-- 1. 将 tb_emp 表的ID为1员工 姓名name字段更新为 '张三'
update tb_emp set name = '张三' , update_time = now() where id = 1;

-- 2. 将 tb_emp 表的所有员工的入职日期更新为 '2010-01-01'
update tb_emp set entrydate = '2010-01-01', update_time = now();


-- DML : 删除数据 - delete
-- 1. 删除 tb_emp 表中 ID为1的员工
delete from tb_emp where id = 1;

-- 2. 删除 tb_emp 表中的所有员工
delete from tb_emp;


























-- javaweb_db01.tb_emp definition

CREATE TABLE `tb_emp` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT '123456' COMMENT '密码',
  `name` varchar(10) NOT NULL COMMENT '姓名',
  `gender` tinyint unsigned NOT NULL COMMENT '性别, 1 男, 2 女',
  `image` varchar(300) DEFAULT NULL COMMENT '图像url',
  `job` tinyint unsigned DEFAULT NULL COMMENT '职位, 1 班主任 , 2 讲师 , 3 学工主管, 4 教研主管',
  `entrydate` date DEFAULT NULL COMMENT '入职日期',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工表';




-- DDL: 查看表结构
-- 查看: 当前数据库下的表
show tables;

-- 查看: 查看指定表结构
desc tb_emp;

-- 查看: 数据库的建表语句
show create table tb_emp;


-- DDL: 修改表结构
-- 修改: 为表 tb_emp 添加字段 qq varchar(11)
alter table tb_emp add qq varchar(11) comment 'QQ';

-- 修改: 修改 tb_emp 字段类型 qq varchar(13)
alter table tb_emp modify qq varchar(13) comment 'QQ';

-- 修改: 修改 tb_emp 字段名 qq 为 qq_num varchar(13)
alter table tb_emp change qq qq_num varchar(13) comment 'QQ';

-- 修改: 删除 tb_emp 的 qq_num 字段
alter table tb_emp drop column qq_num;

-- 修改: 将tb_emp 表名修改为 emp
rename table tb_emp to emp;
rename table emp to tb_emp;

-- DDL: 删除表结构
-- 删除: 删除 tb_emp 表
drop table if exists tb_emp;




















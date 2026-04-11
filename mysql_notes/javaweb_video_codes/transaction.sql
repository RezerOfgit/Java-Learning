-- ==================================== 事务 ===========================
-- 开启事务
start transaction ;

-- 删除部门
delete from tb_dept where id = 2;

-- 删除部门下的员工
delete from tb_emp where dept_id == 2;


-- 提交事务
commit;

-- 回滚事务
rollback ;


select * from tb_dept;
select * from tb_emp;

-- 演示update语句
-- 要求：在上面创建的employee表中修改表中的纪录
-- 1．将所有员工薪水修改为5000元。[如果没有带where条件，会修改所有的记录，因此要小心］
UPDATE EMPLOYEE SET SALARY = 5000;

-- 2.将姓名为jack的员工薪水修改为3000元。
UPDATE EMPLOYEE SET SALARY = 3000
		WHERE USER_NAME = 'jack';

-- 3.将 marry 的薪水在原有基础上增加1000元
UPDATE EMPLOYEE SET SALARY = SALARY + 1000
		WHERE USER_NAME = 'marry';

-- 可以修改多个列的值
UPDATE EMPLOYEE SET 
			SALARY = SALARY + 1000, job = '摸鱼大王'
			WHERE USER_NAME = 'marry';

SELECT * FROM EMPLOYEE E ;


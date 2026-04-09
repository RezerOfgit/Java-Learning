--  =================== 排序查询 ======================


-- 1. 根据入职时间, 对员工进行升序排序  -- 排序条件
SELECT * FROM EMP E ORDER BY ENTRYDATE ASC;-- 默认升序, asc可以省略的

SELECT * FROM EMP E ORDER BY ENTRYDATE;

-- 2. 根据入职时间, 对员工进行降序排序
SELECT * FROM EMP E ORDER BY ENTRYDATE DESC;

-- 3. 根据 入职时间 对公司的员工进行 升序排序 ， 入职时间相同 , 再按照 ID 进行降序排序
SELECT * FROM EMP E ORDER BY ENTRYDATE , id DESC ;





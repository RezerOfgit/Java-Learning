SELECT applicant, material_id, quantity, create_time
FROM (
    SELECT *, ROW_NUMBER() OVER (PARTITION BY applicant ORDER BY create_time DESC) AS rn
    FROM record
) t
WHERE rn = 1;

SELECT id, applicant, quantity,
       ROW_NUMBER() OVER (ORDER BY create_time DESC) AS rank_num
FROM record;

ROW_NUMBER() OVER (PARTITION BY 分组字段 ORDER BY 排序字段)
START TRANSACTION;

-- 1. 扣减库存
UPDATE material
SET stock = stock - 2, version = version + 1
WHERE id = 1 AND stock >= 2;

-- 2. 判断是否成功（通过 ROW_COUNT()）
-- 如果返回 0 行 → ROLLBACK

-- 3. 插入领用记录
INSERT INTO record (material_id, applicant, quantity, remark, status)
VALUES (1, 'test01', 2, '日常领用', 0);

COMMIT;
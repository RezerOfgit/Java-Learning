SELECT r.id, m.name, r.applicant, r.quantity, r.create_time
FROM record r
JOIN material m ON r.material_id = m.id
WHERE r.status = 0
ORDER BY r.create_time DESC;

SELECT m.name, SUM(r.quantity) AS total_quantity
FROM record r
JOIN material m ON r.material_id = m.id
GROUP BY m.name
ORDER BY total_quantity DESC;

SELECT applicant, COUNT(*) AS apply_count
FROM record
GROUP BY applicant
HAVING apply_count > 3
ORDER BY apply_count DESC;

SELECT name, stock
FROM material
WHERE stock < 10 AND is_deleted = 0;
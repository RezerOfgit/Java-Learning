SELECT m.name, r.applicant, r.quantity
FROM record r
JOIN material m ON r.material_id = m.id
WHERE r.quantity = (SELECT MAX(quantity) FROM record);

SELECT name, stock
FROM material
WHERE id NOT IN (SELECT DISTINCT material_id FROM record)
  AND is_deleted = 0;
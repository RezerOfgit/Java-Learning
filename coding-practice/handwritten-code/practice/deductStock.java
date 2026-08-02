<!-- 批量扣减库存 -->
<update id="deductStock">
    UPDATE material
    SET stock = stock - #{quantity},
        version = version + 1,
        update_time = NOW()
    WHERE id = #{materialId}
      AND stock >= #{quantity}
      AND is_deleted = 0
</update>

<!-- 带条件分页查询 -->
<select id="listByCondition" resultType="MaterialVO">
    SELECT id, name, specification, unit, stock
    FROM material
    <where>
        is_deleted = 0
        <if test="name != null and name != ''">
            AND name LIKE CONCAT('%', #{name}, '%')
        </if>
        <if test="categoryId != null">
            AND category_id = #{categoryId}
        </if>
    </where>
    ORDER BY create_time DESC
</select>
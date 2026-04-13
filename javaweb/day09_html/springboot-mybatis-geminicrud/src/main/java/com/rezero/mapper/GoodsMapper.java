package com.rezero.mapper;

import com.rezero.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * task01
 * 新增商品：插入一条商品数据。【重点要求】：结合 P126，必须配置主键返回（useGeneratedKeys），保证插入成功后，你能从传入的 Goods 对象里直接 getId() 获取到数据库刚生成的自增 ID。
 * 删除商品：根据指定的 id 删除一条商品。
 * 修改库存：传入一个 id 和一个新的 stock_quantity，把该商品的库存更新为新值。
 * 根据 ID 查询：传入一个 id，返回对应的 Goods 对象。
 */
@Mapper
public interface GoodsMapper {

    //新增商品
    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("INSERT INTO goods (name, price, quantity, stock_time, category)" +
            " VALUES (#{name}, #{price}, #{quantity}, #{stockTime}, #{category})")
    public void insert(Goods goods);

    //删除商品
    @Delete("DELETE FROM GOODS WHERE id = #{id}")
    public void delete(Integer id);

    //修改库存
    @Update("UPDATE GOODS SET QUANTITY = quantity - 1 " +
            "WHERE ID = #{id}")
    public void update(Goods goods);

    //根据ID查询
    @Select("SELECT * FROM GOODS WHERE id = #{id}")
    public Goods getById(Integer id);

    public List<Goods> searchGoods(Goods condition);

    public void deleteGoodsByIds(List<Integer> ids);
}

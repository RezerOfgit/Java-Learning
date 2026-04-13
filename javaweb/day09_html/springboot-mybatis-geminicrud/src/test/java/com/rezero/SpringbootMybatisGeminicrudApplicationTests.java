package com.rezero;

import com.rezero.mapper.GoodsMapper;
import com.rezero.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisGeminicrudApplicationTests {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void testInsert() {
        Goods goods = new Goods();
        goods.setName("外套");
        goods.setPrice(399.99);
        goods.setQuantity(200);
        goods.setStockTime(LocalDateTime.of(2025, 11, 11, 11, 11, 11));
        goods.setCategory("衣服");

        goodsMapper.insert(goods);
        System.out.println(goods.getId());
    }

    @Test
    public void testDelete() {
        goodsMapper.delete(7);
    }

    @Test
    public void testUpdate() {
        Goods goods = new Goods();
        goods.setId(6);

        goodsMapper.update(goods);
    }

    @Test
    public void testGetById() {
        Goods goods = goodsMapper.getById(6);
        System.out.println(goods);
    }

    @Test
    public void searchGoods() {
        Goods condition = new Goods();
        condition.setName("鼠");
        condition.setCategoryId(100);

        List<Goods> goodsList = goodsMapper.searchGoods(condition);
        System.out.println(goodsList);
    }

    @Test
    public void deleteGoodsByIds() {
        List<Integer> ids = Arrays.asList(4, 5, 6);
        goodsMapper.deleteGoodsByIds(ids);
    }

}

package com.rezero.dao_.test;

import com.rezero.dao_.dao.ActorDAO;
import com.rezero.dao_.dao.GoodsDAO;
import com.rezero.dao_.domain.Actor;
import com.rezero.dao_.domain.Goods;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestDAO {
    //测试ActorDAO 对actor 表crud 操作
    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();
        //1. 查询
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id>= ?", Actor.class, 1);
        System.out.println("====查询结果====");
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        //2. 查询单行记录
        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 5);
        System.out.println("====查询单行结果====");
        System.out.println(actor);

        //3. 查询单行单列
        Object o = actorDAO.queryScalar("select name from actor where id = ?", 5);
        System.out.println("====查询单行单列值====");
        System.out.println(o);

        //4. dml 操作insert ,update, delete
        int update = actorDAO.update("insert into actor values(null,?,?,?,?)", "张无忌", "男", "2000-11-11", "999");
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
        update = actorDAO.update("update actor set name = ? where id = ?", "小明", 6);
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
        update = actorDAO.update("delete from actor where id = ?", 6);
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
    }

    //测试GoodsDAO 对goods 表crud 操作
    @Test
    public void testGoodsDAO() {
        GoodsDAO goodsDAO = new GoodsDAO();
        //1. 查询
        List<Goods> goods = goodsDAO.queryMulti("select * from goods where id >= ?", Goods.class, 1);
        System.out.println("====查询结果====");
        for (Goods good : goods) {
            System.out.println(good);
        }

        //2. 查询单行记录
        Goods g = goodsDAO.querySingle("select * from goods where id = ?", Goods.class, 2);
        System.out.println("====查询单行结果====");
        System.out.println(g);

        //3. 查询单行单列
        Object o = goodsDAO.queryScalar("select goods_name from goods where id = ?", 3);
        System.out.println("====查询单行单列值====");
        System.out.println(o);

        //4. dml 操作insert ,update, delete
        int update = goodsDAO.update("insert into goods values(null,?,?)", "中兴手机", "999");
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
        update = goodsDAO.update("update goods set goods_name = ? where id = ?", "红魔", 6);
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
        update = goodsDAO.update("delete from goods where id = ?", 6);
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
    }
}

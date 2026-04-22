package com.rezero.datasource;

import org.junit.jupiter.api.Test;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JDBCUtilsByDruid_USE {
    @Test
    public void testSelect() {

        System.out.println("使用druid 方式完成");
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from actor where id = ?";

        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());//运行类型com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 2);//给?号赋值
            //执行, 得到结果集
            set = preparedStatement.executeQuery();
            //遍历该结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }
    }

    //使用土方法来解决ResultSet =封装=> Arraylist
    @Test
    public ArrayList<Actor> testSelectToArrayList() {

        System.out.println("使用druid 方式完成");
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;

        ArrayList<Actor> list = new ArrayList<>();//创建ArrayList 对象,存放actor 对象
        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println(connection.getClass());//运行类型com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 2);//给?号赋值
            //执行, 得到结果集
            set = preparedStatement.executeQuery();
            //遍历该结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                //把得到的resultset 的记录，封装到Actor 对象，放入到list 集合
                Timestamp timestamp = new Timestamp(borndate.getTime());
                list.add(new Actor(id, name, sex, timestamp, phone));
            }
//            System.out.println("lisr 集合数据 = " + list);
            for (Actor actor : list) {
                System.out.println("id = " + actor.getId() + "\t" + actor.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }
        //因为ArrayList 和connection 没有任何关联，所以该集合可以复用.
        return list;
    }
}

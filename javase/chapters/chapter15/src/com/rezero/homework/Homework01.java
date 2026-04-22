package com.rezero.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        //说明
        //这里给T 指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001", new User("jack", 18, 1));
        dao.save("002", new User("tom", 25, 2));
        dao.save("003", new User("marry", 19, 3));
        dao.save("004", new User("milan", 22, 4));

        List<User> list = dao.list();
        System.out.println("list = " + list);

        dao.update("003", new User("smith", 21, 3));
        dao.delete("001");
        System.out.println("====修改后====");
        list = dao.list();
        System.out.println("list = " + list);
        System.out.println("id=003 : " + dao.get("003"));
    }
}
class DAO<T>{//泛型类
    private Map<String, T> map = new HashMap<>();

    //分别创建以下方法：
    //(1) 保存 T 类型的对象到Map 成员变量中
    public void save(String id, T entity){
        map.put(id, entity);
    }
    //(2) 从 map 中获取id 对应的对象
    public T get(String id){
        return map.get(id);
    }
    //(3) 替换map 中key为id的内容，改为 entity 对象
    public void update(String id,T entity){
        map.put(id, entity);
    }
    //(4) 返回map 中存放的所有 T对象
    //遍历map [k-v]，将map的 所有vaLue(T entity)，封装到ArrayList返回即可
    public List<T> list(){
        //创建 ArrayList
        List<T> list = new ArrayList<>();
        //遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));//也可以直接使用本类的 get(String id)
        }
        return list;
    }
    //(5) 删除指定 id 对象
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private String name;
    private int age;
    private int id;

    @Override
    public String toString() {
        return "User name= " + name + ", age=" + age + ", id=" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
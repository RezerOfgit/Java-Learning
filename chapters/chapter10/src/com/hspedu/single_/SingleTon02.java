package com.hspedu.single_;

/**
 * 演示懒汉式的单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
    }
}
class Cat{
    private String name;
    private static Cat cat;
    //步骤
    //1. 构造器私有化
    //2. 定义一个static 静态属性对象
    //3. 提供一个public 的static 方法，可以返回一个cat对象
    //4. 懒汉式，只有当用户使用getInstance()时，才返回cat 对象，后面再次
    //   调用时，会返回上次创建的cat 对象，从而保证了单例
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
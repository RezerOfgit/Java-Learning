package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
class GirlFriend{
    private String name;
    //对象， 通常是重量级对象，饿汉式可能造成创建了对象，但是没有使用
    private static GirlFriend gf = new GirlFriend("小红");
    //步骤(饿汉式)
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象(该对象是static)
    //3. 提供一个公共的static 方法，返回gf 对象
    private GirlFriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
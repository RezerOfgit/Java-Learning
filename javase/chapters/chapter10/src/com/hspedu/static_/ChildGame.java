package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {
        //int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
        //count++;
        child1.count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        //count++;
        child2.count++;

        Child child3 = new Child("老鼠精");
        child3.join();
        //count++;
        child3.count++;

        System.out.println("共有" + Child.count + " 个小孩加入了游戏...");
        System.out.println("child1.count = " + child1.count);
        System.out.println("child2.count = " + child2.count);
        System.out.println("child3.count = " + child3.count);
    }
}
class Child{//类
    private String name;
    //定义一个变量count , 是一个类变量(静态变量)static 静态
    //该变量最大的特点就是会被Child 类的所有的对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + " 加入了游戏..");
    }
}

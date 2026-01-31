package com.hspedu.extend_;

//输入ctrl + h 可以看到类的继承关系
public class Sub extends Base{//子类
    public Sub(String name, int age){
        //1.要调用父类的无参构造器，如下或者 什么都不写，默认就是调用super()
        //super();//父类的无参构造器
        //2.调用父类的Base(String name)构造器
        //super("hsp");
        //3.调用父类的Base(String name, int age)构造器
        super("k11", 20);
        System.out.println("子类sub(String name, int age)构造器被调用...");
    }
    public Sub(){//无参构造器
        super("smith", 10);//默认调用父类的无参构造器
        System.out.println("子类sub()构造器被调用...");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name){
        super("tom", 30);
        //do nothing...
        System.out.println("子类sub(String name)构造器被调用...");
    }

    public void sayOk(){//子类方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();
        System.out.println("n4 = " + getN4());
        calltest400();
    }
}

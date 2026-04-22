package com.hspedu.super_;

public class B extends A {
    int n1 = 888;
    public void sum(){
        cal();
//        this.cal();
//        super.cal();
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }


    //访问父类的属性，但不能访问父类的private 属性
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " +
                super.n3/*+ super.n4*/);
    }
    //访问父类的方法，不能访问父类的private 方法
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//不能访问父类private方法
    }
    //访问父类的构造器：super(参数列表);只能放在构造器第一句，只能出现一句

    public B() {
//        super();
//        super("jack", 10);
        super("jack");
    }
}

package com.hspedu.override_;

public class Dog extends Animal {
    @Override
    public void cry(){
        //1.因为dog是animal子类
        //2.dog的cry方法和animal 的cry 定义形式一样(名称、返回类型、参数)
        //3.这我们就说dog 的cry方法，重写了animal 的cry方法
        System.out.println("小狗汪汪叫...");
    }
}

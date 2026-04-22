package com.hspedu.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master() {
    }
    //使用多态机制，可以统一管理主人喂食的问题
    //animal 编译类型是Animal， 可以指向(接收) Animal 子类的对象
    //food 编译类型是Food， 可以指向(接收) Food 子类的对象
    public void feed(Animal animal, Food food){
        System.out.println("主人" + name + "给" + animal.getName() +
                "吃" + food.getName());
    }
}

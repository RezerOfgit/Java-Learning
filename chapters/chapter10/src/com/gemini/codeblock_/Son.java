package com.gemini.codeblock_;

public class Son extends Father{
    static {//静态代码块
        System.out.println("子类静态代码块：王子的雕像建好了");
    }
    {//普通代码块
        System.out.println("子类普通代码块：王子正在换衣服");
    }

    public Son() {//构造器
        //super();
        System.out.println("子类构造器：王子登场，继承王位");
    }
}

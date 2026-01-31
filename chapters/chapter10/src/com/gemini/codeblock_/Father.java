package com.gemini.codeblock_;

public class Father {
    static {//静态代码块
        System.out.println("父类静态代码块：老国王的雕像建好了");
    }
    {//普通代码块
        System.out.println("父类普通代码块：老国王正在整理皇冠");
    }

    public Father() {//构造器
        System.out.println("父类构造器：老国王登场");
    }
}

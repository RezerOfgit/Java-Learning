package com.hspedu.codeblock_;

public class CodeBlockExercise02 {
    //主方法
    public static void main(String[] args) {
        Test01 a = new Test01();//无参构造器
        //运行结果
    }
}

/**
 * 先加载类 再 创建对象
 * (1) 静态成员sam初始化
 * (2) static块执行
 * (3) sam1成员初始化
 * (4) Test默认构造函数被调用
 */
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");
    }
}
class Test01{
    Sample sam1 = new Sample("sam1成员初始化");//
    static Sample sam = new Sample("静态成员sam初始化");//
    static {
        System.out.println("static块执行");//
        if (sam == null)
            System.out.println("sam is null");
    }
    Test01(){
    System.out.println("Test默认构造函数被调用");//
    }
}



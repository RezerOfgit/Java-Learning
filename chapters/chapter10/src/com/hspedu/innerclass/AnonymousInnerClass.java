package com.hspedu.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();
    }
}
class Outer04{//外部类
    private int n1 = 10;
    public void method(){//方法
        //基于接口的匿名内部类
        //1. 需求：想使用IA接口，拧创建对象
        //2. 传统方式是写一个类， 实现该接口，并创建对象
        //3. Tiger/Dog 类只使用一次，后面再不使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型？IA
        //6. tiger的运行类型？就是匿名内部类 XXXX => Outer04$1
        /*
            底层：
            class XXXX implements IA{
                @Override
                public void cry() {
                    System.out.println("老虎在咆哮...");
                }
            }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1,立即就创建了Outer04$1 实例，
        //   并且把地址返回给tiger
        //8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎在咆哮...");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());
        tiger.cry();
//        IA tiger = new Tiger();
//        tiger.cry();
        //演示基于类的匿名内部类
        //分析
        //1. father编译类型 Father
        //2. father运行类型 Outer04$2,如果不含{}
        //   Father father = new Father("jack")的运行类型是Father
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2的对象
        //5. 注意（"jack"）参数列表会传递给 构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行机制 = " + father.getClass());
        father.test();
        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}
interface IA{//接口
    public void cry();
}
//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎在咆哮...");
//    }
//}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪...");
//    }
//}
class Father{
    public Father(String name){//构造器
        System.out.println("接收到 name = " + name);
    }
    public void test(){//方法
    }
}
abstract class Animal{//抽象类
    abstract void eat();
}
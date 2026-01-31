package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        //1. 传递的是实现了 Bell接口的匿名内部类 InnerClassExerciseo2$1
        //2. 重写了 ring
        //3. Bell bell = new Bell() {
//                    @Override
//                    public void ring() {
//                        System.out.println("懒猪起床啦");
//                    }
//                }
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
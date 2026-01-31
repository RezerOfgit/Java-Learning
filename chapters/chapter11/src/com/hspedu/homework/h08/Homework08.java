package com.hspedu.homework.h08;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //比较一下
        //switch()中，放入枚举对象
        //在每个case 后，直接写上在枚举类中，定义的枚举对象即可
        switch (green){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("没有匹配到...");
        }
    }
}

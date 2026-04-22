package com.gemini.movie_;

public class task03 {
    public static void main(String[] args) {
        System.out.println("第一场：");
        new Movie("阿凡达");

        System.out.println("第二场：");
        new Movie("流浪地球");
    }
}
class Movie{
    private String name;
    static {
        System.out.println("--- 1. 影院屏幕设备检查完成 ---");
    };
    {
        System.out.println("--- 2. 广告开始了 ---");
    };

    public Movie(String name) {
        System.out.println("--- 3. 电影" + name + "正式开始 ---");
        this.name = name;
    }
}
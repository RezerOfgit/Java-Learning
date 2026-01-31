package com.gemini.inner02;

public class Mobile {
    private String name = "Gemini";
    public void showPosition(){
        class Gps{
            public void track(){
                System.out.println("正在定位" + name + "的位置...");
            }
        }
        Gps gps = new Gps();
        gps.track();
    }
}

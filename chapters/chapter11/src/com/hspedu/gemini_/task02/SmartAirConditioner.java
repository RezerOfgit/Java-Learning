package com.hspedu.gemini_.task02;

/**
 * @author Re-zero
 * @version 1.0
 */
public class SmartAirConditioner {
    public void work(Season season, Mode mode){
        if (season == Season.SUMMER) {
            System.out.println("检测到夏天...");
        }else if(season == Season.WINTER){
            System.out.println("检测到冬天...");
        }
        mode.execute();
    }
}

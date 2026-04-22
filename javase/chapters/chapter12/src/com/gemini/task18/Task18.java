package com.gemini.task18;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task18 {
    public static void work(int time){
        try {
            System.out.println("正在工作...");
            if (time > 8){
                throw new RuntimeException("累瘫了");
            }
        } catch (RuntimeException e) {
            System.out.println("休息一会儿:" + e);
        } finally {
            System.out.println("下班打卡!");
        }
    }

    public static void main(String[] args) {
        work(5);
        work(10);
    }
}

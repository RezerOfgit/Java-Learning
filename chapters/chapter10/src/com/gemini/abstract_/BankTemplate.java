package com.gemini.abstract_;

abstract public class BankTemplate {
    public abstract void calculateInterest();
    public void process(){
        System.out.println("1.查询本金：10000元");
        calculateInterest();
        System.out.println("3.流程结束，请取卡");
    }
}

package com.gemini.abstract_;

public class CurrentAccount extends BankTemplate{
    @Override
    public void calculateInterest() {
        System.out.println("2. 按活期利率计算：利息 = 3.5 元");
    }
}

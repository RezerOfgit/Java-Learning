package com.gemini.abstract_;

public class FixedAccount extends BankTemplate{
    @Override
    public void calculateInterest() {
        System.out.println("2. 按定期利率计算：利息 = 300.0 元");
    }
}

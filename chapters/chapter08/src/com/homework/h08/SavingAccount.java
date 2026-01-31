package com.homework.h08;

public class SavingAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01;

    public void earnMonthlyInterest(){
        count = 3;
        System.out.println("本月利息为" + getBalance() * rate);
        setBalance(getBalance() * (1 + rate));
        System.out.println("含利息的余额为" + getBalance());
    }

    @Override
    public void initialBal() {
        super.initialBal();
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            setBalance(getBalance() + amount); // 显式调用 setter
            System.out.println("本次交易免除手续费，您本月免手续费次数还有：" + count);
            count--;
        }else {
            setBalance(getBalance() + amount - 1); // 显式调用 setter
            System.out.println("本次交易已扣除手续费");
        }
        System.out.println("已存入" + amount + "元，余额还有" +
                getBalance() + "元");
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            setBalance(getBalance() - amount); // 显式调用 setter
            System.out.println("本次交易免除手续费，您本月免手续费次数还有：" + count);
            count--;
        }else {
            setBalance(getBalance() + amount - 1); // 显式调用 setter
            System.out.println("本次交易已扣除手续费");
        }
        System.out.println("已取出" + amount + "元，余额还有" +
                getBalance() + "元");
    }

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

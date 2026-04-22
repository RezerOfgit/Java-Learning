package com.homework.h08;

public class CheckingAccount extends BankAccount{
    private double handlingFee;//手续费

    public CheckingAccount(double initialBalance, double handlingFee) {
        super(initialBalance);
        this.handlingFee = handlingFee;
    }

    public double getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(double handlingFee) {
        this.handlingFee = handlingFee;
    }

    @Override
    public void initialBal() {
        super.initialBal();
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount - handlingFee); // 显式调用 setter
        System.out.println("已存入" + amount + "元，同时扣除手续费" +
                handlingFee + "元，余额还有" + getBalance() + "元");
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount - handlingFee); // 显式调用 setter
        System.out.println("已取出" + amount + "元，同时扣除手续费" +
                handlingFee + "元，余额还有" + getBalance() + "元");
    }
}

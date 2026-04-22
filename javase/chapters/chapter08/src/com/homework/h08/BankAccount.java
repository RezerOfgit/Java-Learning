package com.homework.h08;

public class BankAccount {
    private double balance;
    //private double initialBalance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void initialBal(){
        System.out.println("账户初始余额有" + balance + "元");
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("已存入" + amount + "元，余额还有" + balance + "元");
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("已取出" + amount + "元，余额还有" + balance + "元");
    }
//set和 getBalance方法
}

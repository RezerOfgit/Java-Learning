package com.homework.h08;

/**
 * 要求：
 * （1）在上面类的基础上扩展新类CheckingAccount
 * 对每次存款和取款都收取1美元的手续费
 * （2）扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生
 * （earnMonthlyInterest方法被调用），并且有每月三次免手续费的存款或取款。
 * 在earnMonthlyInterest方法中重置交易计数
 * （3）体会重写的好处
 */
public class Homework08 {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(1000);
//        bankAccount.initialBal();
//        bankAccount.deposit(200);
//        bankAccount.withdraw(150);

//        CheckingAccount checkingAccount = new CheckingAccount(1000, 1);
//        checkingAccount.initialBal();
//        checkingAccount.deposit(200);
//        checkingAccount.withdraw(150);

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.initialBal();
        savingAccount.earnMonthlyInterest();
        savingAccount.deposit(200);
        savingAccount.withdraw(150);
        savingAccount.withdraw(150);
        savingAccount.withdraw(150);
    }
}



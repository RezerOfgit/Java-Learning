package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("jack", 19, "123456");
        System.out.println(account.info());
    }
}
class Account{
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度不符合要求，返回默认名字");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(>20)默认为0");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码6位，请重新输入，默认为0");
            this.password = "000000";
        }
    }
    public String info(){
        return "名字是" + name + "余额是" + balance + "密码是" + password;
    }
}

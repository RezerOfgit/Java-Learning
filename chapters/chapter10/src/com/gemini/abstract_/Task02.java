package com.gemini.abstract_;

public class Task02 {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.process();
        FixedAccount fixedAccount = new FixedAccount();
        fixedAccount.process();
    }
}

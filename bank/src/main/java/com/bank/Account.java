package com.bank;

public class Account {

    private final String accountNumber;

    private double balance;

    public Account(String accountNumber) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

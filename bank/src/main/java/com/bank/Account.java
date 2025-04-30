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
        if (amount < 0) {
            return;
        }
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }
}

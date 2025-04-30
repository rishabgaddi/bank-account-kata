package com.bank;

import java.util.List;

public class Account {

    private final String accountNumber;

    private double balance;
    private List<TransactionHistory> transactionHistory;

    public Account(String accountNumber) {
        this.balance = 0.0;
        this.transactionHistory = List.of();
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<TransactionHistory> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        return amount;
    }
}

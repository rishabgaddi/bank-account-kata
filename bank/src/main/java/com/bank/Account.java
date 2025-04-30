package com.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private final String accountNumber;
    private final List<TransactionHistory> transactionHistory;

    private double balance;

    public Account(String accountNumber) {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
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
        transactionHistory.add(new TransactionHistory(Operation.DEPOSIT, new Date(), amount, balance));
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        transactionHistory.add(new TransactionHistory(Operation.WITHDRAW, new Date(), amount, balance));
        return amount;
    }
}

package com.bank;

import java.util.Date;

public record TransactionHistory(Operation operation, Date date, double amount, double balance) {

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "operation=" + operation +
                ", date=" + date +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}

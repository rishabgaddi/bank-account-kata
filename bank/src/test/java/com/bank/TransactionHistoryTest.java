package com.bank;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransactionHistoryTest {

    @Test
    public void transaction_history_creation() {
        TransactionHistory transactionHistory = new TransactionHistory(Operation.DEPOSIT, new Date(), 100.0, 100.0);
        assertEquals(Operation.DEPOSIT, transactionHistory.operation());
        assertNotNull(transactionHistory.date());
        assertEquals(100.0, transactionHistory.amount(), 0.01);
        assertEquals(100.0, transactionHistory.balance(), 0.01);
    }
}
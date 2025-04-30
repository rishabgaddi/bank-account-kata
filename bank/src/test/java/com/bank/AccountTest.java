package com.bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {

    @Test
    public void account_creation() {
        Account account = new Account("123456789");
        assertEquals(0.0, account.getBalance(), 0.0);
        assertEquals("123456789", account.getAccountNumber());
    }

    @Test
    public void client_can_deposit() {
        Account account = new Account("123456789");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void negative_deposit_does_not_change_balance() {
        Account account = new Account("123456789");
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    public void client_can_withdraw() {
        Account account = new Account("123456789");
        account.deposit(200.0);
        double amountWithdrawn = account.withdraw(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
        assertEquals(100.0, amountWithdrawn, 0.01);
    }

    @Test
    public void client_cannot_withdraw_more_than_balance() {
        Account account = new Account("123456789");
        account.deposit(100.0);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds", illegalArgumentException.getMessage());
    }
}
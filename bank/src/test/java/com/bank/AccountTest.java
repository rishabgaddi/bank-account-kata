package com.bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void account_creation() {
        Account account = new Account( "123456789");
        assertEquals(0.0, account.getBalance(), 0.0);
        assertEquals("123456789", account.getAccountNumber());
    }

    @Test
    public void client_can_deposit() {
        Account account = new Account("123456789");
        account.deposit( 100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

}
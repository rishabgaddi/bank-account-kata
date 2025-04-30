package com.bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void account_creation() {
        Account account = new Account(99.99, "123456789");
        assertEquals(99.99, account.balance(), 0.01);
        assertEquals("123456789", account.accountNumber());
    }

}
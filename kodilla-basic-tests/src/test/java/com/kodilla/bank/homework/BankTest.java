package com.kodilla.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;

    @BeforeEach
    pubic void setUp(){
        bank = new Bank(2);
    }

    @Test
    public void testTotalBalance() {
        addTransactions(200, -100);
        assertEquals(100, bank.getTotalBalance());
    }

    @Test
    public void testTotalNumberOfDeposits() {
        addTransactions(200, 300);
        assertEquals(2, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void testAverageWithdrawal() {
        addTransactions(-200, -300);
        assertEquals(-250, bank.getAverageWithdrawal());
    }

    @Test
    public void testAverageDeposit() {
        addTransactions(200, 300);
        assertEquals(250, bank.getAverageDeposit());
    }

    public void addTransactions(int first, int second) {
        bank.getCashMachine(0).addTransaction(first);
        bank.getCashMachine(1).addTransaction(second);
    }
}
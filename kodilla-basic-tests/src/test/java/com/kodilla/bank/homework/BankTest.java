package com.kodilla.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class BankTest {

        @Test
        public void testTotalBalance() {
            Bank bank = new Bank(2);
            bank.getCashMachine(0).addTransaction(200);
            bank.getCashMachine(1).addTransaction(-100);

            assertEquals(100, bank.getTotalBalance());
        }

        @Test
        public void testTotalNumberOfDeposits() {
            Bank bank = new Bank(2);
            bank.getCashMachine(0).addTransaction(200);
            bank.getCashMachine(1).addTransaction(300);

            assertEquals(2, bank.getTotalNumberOfDeposits());
        }

        @Test
        public void testAverageWithdrawal() {
            Bank bank = new Bank(2);
            bank.getCashMachine(0).addTransaction(-200);
            bank.getCashMachine(1).addTransaction(-300);

            assertEquals(-250, bank.getAverageWithdrawal());
        }

        @Test
        public void testAverageDeposit() {
            Bank bank = new Bank(2);
            bank.getCashMachine(0).addTransaction(200);
            bank.getCashMachine(1).addTransaction(300);

            assertEquals(250, bank.getAverageDeposit());
        }
    }

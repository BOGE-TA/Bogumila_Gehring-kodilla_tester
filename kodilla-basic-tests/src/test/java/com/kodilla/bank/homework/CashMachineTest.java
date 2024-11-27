package com.kodilla.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class CashMachineTest {

        @Test
        public void testAddTransactionAndBalance() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(-100);
            cashMachine.addTransaction(300);

            assertEquals(400, cashMachine.getBalance());
        }

        @Test
        public void testNumberOfTransactions() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(-100);

            assertEquals(2, cashMachine.getNumberOfTransactions());
        }

        @Test
        public void testAverageDeposit() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(200);
            cashMachine.addTransaction(300);

            assertEquals(250, cashMachine.getAverageDeposit());
        }

        @Test
        public void testAverageWithdrawal() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.addTransaction(-200);
            cashMachine.addTransaction(-300);

            assertEquals(-250, cashMachine.getAverageWithdrawal());
        }
    }


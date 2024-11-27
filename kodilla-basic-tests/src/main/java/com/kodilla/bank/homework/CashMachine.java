package com.kodilla.bank.homework;

public class CashMachine {
        private double[] transactions;
        private int size;

        public CashMachine() {
            this.transactions = new double[0];
            this.size = 0;
        }

        public void addTransaction(double amount) {
            if (amount == 0) {
                return; // Ignorujemy transakcje o wartości 0
            }
            size++;
            double[] newTransactions = new double[size];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[size - 1] = amount;
            transactions = newTransactions;
        }

        public double getBalance() {
            double balance = 0;
            for (double transaction : transactions) {
                balance += transaction;
            }
            return balance;
        }

        public int getNumberOfTransactions() {
            return transactions.length;
        }

        public int getNumberOfDeposits() {
            int count = 0;
            for (double transaction : transactions) {
                if (transaction > 0) {
                    count++;
                }
            }
            return count;
        }

        public int getNumberOfWithdrawals() {
            int count = 0;
            for (double transaction : transactions) {
                if (transaction < 0) {
                    count++;
                }
            }
            return count;
        }

        public double getAverageWithdrawal() {
            double total = 0;
            int count = 0;
            for (double transaction : transactions) {
                if (transaction < 0) {
                    total += transaction;
                    count++;
                }
            }
            return count == 0 ? 0 : total / count;
        }

        public double getAverageDeposit() {
            double total = 0;
            int count = 0;
            for (double transaction : transactions) {
                if (transaction > 0) {
                    total += transaction;
                    count++;
                }
            }
            return count == 0 ? 0 : total / count;
        }
    }


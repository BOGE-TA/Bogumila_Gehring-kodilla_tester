package com.kodilla.bank.homework;

public class Bank {
        private CashMachine[] cashMachines;

        public Bank(int numberOfCashMachines) {
            this.cashMachines = new CashMachine[numberOfCashMachines];
            for (int i = 0; i < numberOfCashMachines; i++) {
                this.cashMachines[i] = new CashMachine();
            }
        }

        public CashMachine getCashMachine(int index) {
            if (index < 0 || index >= cashMachines.length) {
                throw new IllegalArgumentException("Invalid cash machine index.");
            }
            return cashMachines[index];
        }

        public double getTotalBalance() {
            double totalBalance = 0;
            for (CashMachine cashMachine : cashMachines) {
                totalBalance += cashMachine.getBalance();
            }
            return totalBalance;
        }

        public int getTotalNumberOfWithdrawals() {
            int total = 0;
            for (CashMachine cashMachine : cashMachines) {
                total += cashMachine.getNumberOfWithdrawals();
            }
            return total;
        }

        public int getTotalNumberOfDeposits() {
            int total = 0;
            for (CashMachine cashMachine : cashMachines) {
                total += cashMachine.getNumberOfDeposits();
            }
            return total;
        }

        public double getAverageWithdrawal() {
            double total = 0;
            int count = 0;
            for (CashMachine cashMachine : cashMachines) {
                total += cashMachine.getAverageWithdrawal() * cashMachine.getNumberOfWithdrawals();
                count += cashMachine.getNumberOfWithdrawals();
            }
            return count == 0 ? 0 : total / count;
        }

        public double getAverageDeposit() {
            double total = 0;
            int count = 0;
            for (CashMachine cashMachine : cashMachines) {
                total += cashMachine.getAverageDeposit() * cashMachine.getNumberOfDeposits();
                count += cashMachine.getNumberOfDeposits();
            }
            return count == 0 ? 0 : total / count;
        }
    }


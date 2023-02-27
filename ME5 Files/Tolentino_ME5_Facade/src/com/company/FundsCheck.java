package com.company;

public class FundsCheck {

    private double cashInAccount = 900.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn) { cashInAccount -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if(cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: Insufficient Funds");
            System.out.println("Your Current Balance: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Your Current Balance is " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Your Current Balance is " + getCashInAccount());

    }

}
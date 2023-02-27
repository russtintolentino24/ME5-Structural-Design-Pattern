package com.company;

public class AccountNumberCheck{

    private int accountNumber = 987654321;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){

        if(acctNumToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }

    }

}
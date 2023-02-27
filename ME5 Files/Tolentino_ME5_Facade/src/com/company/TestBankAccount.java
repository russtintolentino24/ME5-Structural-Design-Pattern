package com.company;

public class TestBankAccount {

    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(987654321, 2324);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(951.00);

    }

}
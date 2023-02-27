package com.company;

public class SecurityCodeCheck {

    private int securityCode = 2324;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }

}
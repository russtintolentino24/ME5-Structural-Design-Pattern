package com.company;



public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceState, int newMaxSetting){

        super.deviceState = newDeviceState;

        super.maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("DVD Skips to Previous Chapter");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("DVD Skips to Next Chapter");

        deviceState++;

    }


}
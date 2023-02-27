package com.company;


public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting){

        deviceState = newDeviceState;

        maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("Previous Channel");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("Next Channel");

        deviceState++;

    }

}
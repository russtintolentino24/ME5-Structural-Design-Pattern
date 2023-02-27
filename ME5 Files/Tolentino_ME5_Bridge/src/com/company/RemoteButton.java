package com.company;


public abstract class RemoteButton{


    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice){

        theDevice = newDevice;

    }

    public void buttonFivePressed() {

        theDevice.buttonFivePressed();

    }

    public void buttonSixPressed() {

        theDevice.buttonSixPressed();

    }


    public void deviceFeedback(){

        theDevice.deviceFeedback();

    }

    public abstract void buttonNinePressed();

    //return device state of theDevice to be passed on to show "more accurate" Device Feedback with proper naming
    public int deviceFB(){

        return theDevice.deviceState;
    }

    public abstract void showDeviceFB();

}
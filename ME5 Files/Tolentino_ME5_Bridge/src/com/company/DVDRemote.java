package com.company;



public class DVDRemote extends RemoteButton{

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        play = !play;

        System.out.println("DVD is Playing: " + play);

    }

    public void showDeviceFB(){
        System.out.println("DVD on Chapter " + deviceFB());
    }

}
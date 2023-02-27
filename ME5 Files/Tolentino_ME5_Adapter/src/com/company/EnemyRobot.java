package com.company;
import java.util.Random;

public class EnemyRobot{

    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot used Slap with " + attackDamage + " Damage ");

    }

    public void walkForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Dashed Forward " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {

        System.out.println("Enemy Robot Copies the Driving Pattern of " + driverName);

    }



}
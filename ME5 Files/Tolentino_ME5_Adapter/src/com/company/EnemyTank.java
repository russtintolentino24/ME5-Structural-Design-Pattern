package com.company;
import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Shoots with " + attackDamage + " Damage");

    }

    public void driveForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank Drives " + movement + " spaces");

    }

    public void assignDriver(String driverName) {

        System.out.println(driverName + " is the driver of the tank");

    }

}
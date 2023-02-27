package com.company;

//Since all pizza that will be created will have PlainPizza as its "base form" containing all the required elements of pizza

public class PlainPizza implements Pizza {

    public String getDescription() {

        return "Thick dough";

    }

    public double getCost() {

        System.out.println("Cost of Dough: " + 8.00);

        return 8.00;

    }

}
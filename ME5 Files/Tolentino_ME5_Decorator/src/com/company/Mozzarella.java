package com.company;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {

        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Shredded Mozzarella");
    }


    public String getDescription(){

        return tempPizza.getDescription() + ", Shredded Mozzarella";

    }

    public double getCost(){

        System.out.println("Cost of Shredded Mozzarella: " + 2.50);

        return tempPizza.getCost() + 2.50;

    }

}
package com.company;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        System.out.println("Adding Tomato Sauce made with fresh tomatoes");
    }


    public String getDescription(){

        return tempPizza.getDescription() + ", Tomato sauce from fresh tomatoes";

    }

    public double getCost(){

        System.out.println("Cost of Sauce: " + 1.35);

        return tempPizza.getCost() + 1.35;

    }

}
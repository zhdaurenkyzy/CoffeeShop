package com.company.TypeCoffee;

import com.company.Arabica;
import com.company.Milk.Milk;
import com.company.Water;

public class Cappuccino extends Coffee {
    private String name = "Cappuccino";
    private Milk milk;

    public Cappuccino(Arabica arabica, Water water, Milk milk) {
        super(arabica, water);
        this.milk=milk;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getStandartSizeCoffee() {
    return super.getStandartSizeCoffee()+milk.getAmountOfMilk();
    }

    public void setStandartSizeCoffee(){
        getArabica().setAmountOfArabica_gram(20);
        milk.setAmountOfMilk(40);
       getWater().setAmountOfWater_ml(90);
    }
}

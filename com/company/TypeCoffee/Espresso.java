package com.company.TypeCoffee;

import com.company.Arabica;
import com.company.Water;

public class Espresso extends Coffee {
    private String name = "Espresso";

    public Espresso(Arabica arabica, Water water) {
        super(arabica, water);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getStandartSizeCoffee() {
        return super.getStandartSizeCoffee();
    }

    public void setStandartSizeCoffee() {
        getArabica().setAmountOfArabica_gram(20);
        getWater().setAmountOfWater_ml(100);
    }
}

package com.company.TypeCoffee;

import com.company.Other;
import com.company.Arabica;
import com.company.Sugar.Sugar;
import com.company.Water;

public class Mocco extends Coffee {
    private String name = "Mocco";
    private Sugar sugar;
    private Other other;

    public Mocco(Arabica arabica, Water water, Other other) {
        super(arabica, water);
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getStandartSizeCoffee() {
        return super.getStandartSizeCoffee()+other.getAddition().get("chocolate")+sugar.getSpoonOfSugar();
    }

    public void setStandartSizeCoffee(){
        getArabica().setAmountOfArabica_gram(40);
        getWater().setAmountOfWater_ml(100);
    }
}

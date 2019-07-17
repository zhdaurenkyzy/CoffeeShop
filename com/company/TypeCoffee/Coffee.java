package com.company.TypeCoffee;

import com.company.Arabica;
import com.company.Water;

public class Coffee {
    private String name;
    private int sizeCoffee;
    private Arabica arabica;
    private Water water;

    public Coffee() {
    }

    public Coffee(Arabica arabica, Water water) {
        this.arabica = arabica;
        this.water = water;
    }

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStandartSizeCoffee() {
        return arabica.getAmountOfArabica_gram()+water.getAmountOfWater_ml();
    }

    public void setStandartSizeCoffee() {
        this.sizeCoffee = sizeCoffee;
    }
    
    public Arabica getArabica() {
        return arabica;
    }

    public Water getWater() {
        return water;
    }
}

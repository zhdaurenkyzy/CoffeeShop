package com.company.TypeSugar;

public class Sugar {
    private String nameSugar;
    private double spoonOfSugar;

    public Sugar(double spoonOfSugar) {
        this.spoonOfSugar = spoonOfSugar;
    }

    public String getNameSugar() {
        return nameSugar;
    }

    public double getSpoonOfSugar() {
        return spoonOfSugar;
    }

    public void setSpoonOfSugar(double spoonOfSugar) {
        this.spoonOfSugar = spoonOfSugar;
    }
}

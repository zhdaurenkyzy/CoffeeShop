package com.company.TypeSugar;

public class CaneSugar extends Sugar {
    private String nameSugar = "caneSugar";

    public CaneSugar(double spoonOfSugar) {
        super(spoonOfSugar);
    }

    @Override
    public String getNameSugar() {
        return nameSugar;
    }
}

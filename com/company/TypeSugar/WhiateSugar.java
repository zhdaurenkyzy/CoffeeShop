package com.company.TypeSugar;

public class WhiteSugar extends Sugar {
    private String nameSugar = "caneSugar";

    public WhiteSugar(double spoonOfSugar) {
        super(spoonOfSugar);
    }

    @Override
    public String getNameSugar() {
        return nameSugar;
         }
}
   

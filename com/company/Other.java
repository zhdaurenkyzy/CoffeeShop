package com.company;

import java.util.HashMap;
import java.util.Map;

public class Other {
    String nameOther;
    private double portionOfSupplement_ml;

    public Other() {
    }

    Map<String, Double> addition = new HashMap<>();
    {
        addition.put("syrop", 10.0);
        addition.put("chocolate", 10.0);
        addition.put("cinnamon", 3.0);
        addition.put("vanile", 5.0);
        addition.put("null", 0.0);
    }

    public Map<String, Double> getAddition() {
        return addition;
    }

   public Double getPortionOfAddition_ml(String nameOther){
        return addition.get(nameOther);
   }

    public void setPortionOfSupplement_ml(double portionOfSupplement_ml) {
        this.portionOfSupplement_ml = portionOfSupplement_ml;
    }
}

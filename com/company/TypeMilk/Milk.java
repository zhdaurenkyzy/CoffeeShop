package com.company.TypeMilk;

public class Milk {
    private String nameOfMilk;
    private int amountOfMilk;

    public Milk() {
    }

    public Milk(String nameOfMilk) {
        this.nameOfMilk = nameOfMilk;
    }

    public Milk(String nameOfMilk, int amountOfMilk) {
        this.nameOfMilk = nameOfMilk;
        this.amountOfMilk = amountOfMilk;
    }

    public String getNameOfMilk() {
        return nameOfMilk;
    }

    public void setNameOfMilk(String nameOfMilk) {
        this.nameOfMilk = nameOfMilk;
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }
}

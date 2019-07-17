package com.company;

public enum SizeCupOfCoffee {

    LITTLE(1),
    MIDDLE(2),
    BIG(3);
    private int size_ml;

    SizeCupOfCoffee(int size_ml) {
        this.size_ml = size_ml;
    }

    public int getSize_ml() {
        return size_ml;
    }
}

package com.company;

import com.company.Coffee.Cappuccino;
import com.company.Coffee.Espresso;
import com.company.Coffee.Mocco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose the type of coffee: 1-Cappuccino; \n 2-Espresso; \n 3-Mocco.");
        CoffeeShopService makingCoffee = new CoffeeShopService();
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        Arabica arabica = new Arabica();
        Water water = new Water();
        Other other = new Other();

        switch (menu) {
            case 1:
                Cappuccino cappuccino = new Cappuccino(arabica, water,makingCoffee.getSortMilk());
                cappuccino.setStandartSizeCoffee();
                makingCoffee.make_coffee(cappuccino,makingCoffee.getSortSugar());
                break;
            case 2:
                Espresso espresso = new Espresso(arabica, water);
                espresso.setStandartSizeCoffee();
                makingCoffee.make_coffee(espresso,makingCoffee.getSortSugar());
                break;
            case 3:
                Mocco mocco = new Mocco(arabica, water, other);
                mocco.setStandartSizeCoffee();
                makingCoffee.make_coffee(mocco, makingCoffee.getSortSugar());
                break;
        }
    }
}

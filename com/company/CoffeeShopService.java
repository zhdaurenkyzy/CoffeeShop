package com.company;

import com.company.TypeCoffee.Coffee;
import com.company.TypeMilk.AlmondMilk;
import com.company.TypeMilk.CowsMilk;
import com.company.TypeMilk.Milk;
import com.company.TypeMilk.OatmealMilk;
import com.company.TypeSugar.CaneSugar;
import com.company.TypeSugar.Sugar;
import com.company.TypeSugar.WhiteSugar;
import java.util.Scanner;

public class CoffeeShopService {

    public CoffeeShopService() {
    }

    public Milk getSortMilk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of milk: 1-cow's milk; \n 2-almond milk; \n 3-oatmeal milk");
        int sortMilk = scanner.nextInt();
        Milk milk = new Milk();
        if (sortMilk == 1) {
            Milk cowsMilk = new CowsMilk();
            milk = cowsMilk;
        } else if (sortMilk == 2) {
            Milk almondMilk = new AlmondMilk();
            milk = almondMilk;
        } else if (sortMilk == 3) {
            Milk oatmealMilk = new OatmealMilk();
            milk = oatmealMilk;
        } else System.out.println("You didn't choose the type of milk!");
        return milk;

    }

    public Sugar getSortSugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of sugar: 1-white; \n 2-cane sugar; \n 3-coffee without sugar.");
        Sugar sugar = new Sugar(0);
        int sortSugar = scanner.nextInt();
        if (sortSugar == 1) {
            Sugar whiteSugar = new WhiteSugar(1.0);
            sugar = whiteSugar;
        } else if (sortSugar == 2) {
            Sugar caneSugar = new CaneSugar(2.0);
            sugar = caneSugar;
        } else if (sortSugar == 3) {
            Sugar sugarNull = new Sugar(0);
            sugar = sugarNull;
        } else System.out.println("You didn't choose the type of sugar!");
        return sugar;
    }

    public void make_coffee(Coffee coffee, Sugar sugar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose cup size:");
        String name = scanner.next().toUpperCase();
        double cupOfCoffee = coffee.getStandartSizeCoffee() * SizeCupOfCoffee.valueOf(name).getSize_ml() + sugar.getSpoonOfSugar();
        System.out.println("Your coffee " + coffee.getName() + " is ready! Size cup of coffee " + cupOfCoffee);
    }

    public Other setSortOther() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сhoose additive(other): 1-syrop; \n 2-cinnamon;\n 3-coffee without additives.");
        Other other = new Other();
        int sortOther = scanner.nextInt();
        if (sortOther == 1) {
        other.addition.get("syrop");
        } else if (sortOther == 2) {
        other.addition.get("cinnamon");
        } else if (sortOther == 3) {
        other.addition.get("null");
        }
        return other;
    }
}

package ht11_09_02_18;

import ht11_09_02_18.Drinks.BlackCoffee;
import ht11_09_02_18.Drinks.Drink;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterCount = 1;
        int coffeeCount = 1;
        int sugarCount = 1;
        Drink drink1 = new BlackCoffee(waterCount,coffeeCount,sugarCount);
        System.out.println(drink1.toString() + " price: " + drink1.getPrice());

    }
}

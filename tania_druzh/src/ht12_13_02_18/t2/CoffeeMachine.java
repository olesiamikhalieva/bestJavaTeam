package ht12_13_02_18.t2;

import ht12_13_02_18.t2.Drinks.BlackCoffee;
import ht12_13_02_18.t2.Drinks.Drink;
import ht12_13_02_18.t2.Ingredients.Cinnamon;

public class CoffeeMachine {
    public static void main(String[] args) {

        Drink drink1 = new BlackCoffee();
        System.out.println(drink1.getName() + " price: " + drink1.getPrice());
        drink1 = new Cinnamon(drink1);
        System.out.println(drink1.getName() + " price: " + drink1.getPrice());

    }
}

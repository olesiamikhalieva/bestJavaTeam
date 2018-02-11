package ht11_09_02_18;

import ht11_09_02_18.Drinks.BlackCoffee;
import ht11_09_02_18.Drinks.Drink;

public class CoffeeMachine {
    public static void main(String[] args) {
        Drink drink1 = new BlackCoffee(1,2,2);
        System.out.println(drink1.toString() + " price: " + drink1.getPrice());

    }
}

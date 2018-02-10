package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Ingredients.Chocolate;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Milk;

public class Mocaccino {
    private CoffeeAndWater coffeeAndWater;
    private Chocolate chocolate;
    private Milk milk1;
    private Milk milk2;
    private int priceMocaccino = 0;

    public Mocaccino(CoffeeAndWater coffeeAndWater, Chocolate chocolate, Milk milk1, Milk milk2) {
        this.coffeeAndWater = coffeeAndWater;
        this.chocolate = chocolate;
        this.milk1 = milk1;
        this.milk2 = milk2;
    }

    public int getPriceMocaccino() {
        priceMocaccino = coffeeAndWater.getPrice()+chocolate.getPrice()+milk1.getPrice()+milk2.getPrice();
        return priceMocaccino;
    }
}

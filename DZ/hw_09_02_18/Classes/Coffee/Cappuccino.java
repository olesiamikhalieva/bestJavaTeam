package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Milk;

public class Cappuccino {
    private CoffeeAndWater coffeeAndWater;
    private Milk milk1;
    private Milk milk2;
    private Milk milk3;
    private Milk milk4;
    private Milk milk5;
    private int priceCappuccino = 0;

    public Cappuccino(CoffeeAndWater coffeeAndWater, Milk milk1, Milk milk2, Milk milk3, Milk milk4, Milk milk5) {
        this.coffeeAndWater = coffeeAndWater;
        this.milk1 = milk1;
        this.milk2 = milk2;
        this.milk3 = milk3;
        this.milk4 = milk4;
        this.milk5 = milk5;
    }

    public int getPriceCappuccino() {
        priceCappuccino = coffeeAndWater.getPrice() + milk1.getPrice() + milk2.getPrice() + milk3.getPrice() + milk4.getPrice() + milk5.getPrice();
        return priceCappuccino;
    }
}

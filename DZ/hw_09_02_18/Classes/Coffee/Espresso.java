package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;

public class Espresso {
    private CoffeeAndWater coffeeAndWater;
    private int priceEspresso = 0;

    public Espresso(CoffeeAndWater coffeeAndWater) {
        this.coffeeAndWater = coffeeAndWater;
    }

    public int getPriceEspresso() {
        priceEspresso = coffeeAndWater.getPrice();
        return priceEspresso;
    }
}

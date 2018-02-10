package hw_09_02_18.Classes.Coffee;


import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Water;

public class Americano {
    private CoffeeAndWater coffeeAndWater;
    private Water water1;
    private Water water2;
    private int priceAmericano = 0;

    public Americano(CoffeeAndWater coffeeAndWater, Water water1, Water water2) {
        this.coffeeAndWater = coffeeAndWater;
        this.water1 = water1;
        this.water2 = water2;
    }

    public int getPriceAmericano() {
        this.priceAmericano = coffeeAndWater.getPrice() + water2.getPrice() + water1.getPrice();
        return priceAmericano;
    }
}

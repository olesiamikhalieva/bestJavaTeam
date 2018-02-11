package hw_09_02_18.Classes.Coffee;


import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Water;

public class Americano extends Beverage {
    private CoffeeAndWater coffeeAndWater;
    private Water water1;
    private Water water2;

    public Americano(String name, CoffeeAndWater coffeeAndWater, Water water1, Water water2) {
        super(name);
        this.coffeeAndWater = coffeeAndWater;
        this.water1 = water1;
        this.water2 = water2;
        super.setPrice(coffeeAndWater.getPrice() + water2.getPrice() + water1.getPrice());
    }

    public int getPriceAmericano() {
        return super.getPrice();
    }
}

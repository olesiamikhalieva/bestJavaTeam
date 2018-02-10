package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Milk;
import hw_09_02_18.Classes.Ingredients.Water;

public class CoffeeMilk {
    private CoffeeAndWater coffeeAndWater;
    private Milk milk;
    private int priceCoffeeMilk = 0;

    public CoffeeMilk(CoffeeAndWater coffeeAndWater,Milk milk) {
        this.coffeeAndWater = coffeeAndWater;
        this.milk = milk;
    }

    public int getPriceCoffeeMilk() {
        priceCoffeeMilk = coffeeAndWater.getPrice() + milk.getPrice();
        return priceCoffeeMilk;
    }
}

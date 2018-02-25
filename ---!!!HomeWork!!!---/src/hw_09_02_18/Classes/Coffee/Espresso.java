package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;

public class Espresso extends Beverage{
    private CoffeeAndWater coffeeAndWater;

    public Espresso(String name, CoffeeAndWater coffeeAndWater) {
        super(name);
        this.coffeeAndWater = coffeeAndWater;
        super.setPrice(coffeeAndWater.getPrice());
    }

    public int getPriceEspresso() {
        return super.getPrice();
    }

    @Override
    public String  showComponents() {
        return coffeeAndWater.getName();
    }
}

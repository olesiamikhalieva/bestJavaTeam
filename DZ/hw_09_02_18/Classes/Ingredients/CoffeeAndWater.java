package hw_09_02_18.Classes.Ingredients;

import hw_09_02_18.Classes.Beverage;

public class CoffeeAndWater extends Beverage{
    public CoffeeAndWater() {
        super("Кофе + Вода");
        super.setPrice(6);
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
    @Override
    public String getName() {
        return super.getName();
    }
}



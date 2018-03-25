package hw7_09_02_18.Classes.Ingredients;

import hw7_09_02_18.Classes.Beverage;

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
    @Override
    public String showComponents() {
return "";
    }
}



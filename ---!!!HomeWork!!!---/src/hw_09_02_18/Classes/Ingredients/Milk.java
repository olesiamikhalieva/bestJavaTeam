package hw_09_02_18.Classes.Ingredients;

import hw_09_02_18.Classes.Beverage;

public class Milk extends Beverage{
    public Milk() {
        super("Молоко");
        super.setPrice(5);
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
    public String  showComponents() {
return "";
    }
}

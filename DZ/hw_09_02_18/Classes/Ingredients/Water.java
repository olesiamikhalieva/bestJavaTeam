package hw_09_02_18.Classes.Ingredients;


import hw_09_02_18.Classes.Beverage;

public class Water extends Beverage{
    public Water() {
        super("Вода");
        super.setPrice(1);
    }

    public int getPrice() {
        return super.getPrice();
    }
    @Override
    public String getName() {
        return super.getName();
    }
}

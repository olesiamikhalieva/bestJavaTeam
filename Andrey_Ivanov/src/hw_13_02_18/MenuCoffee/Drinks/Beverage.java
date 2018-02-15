package hw_13_02_18.MenuCoffee.Drinks;

public abstract class Beverage {

    String description="Unknown Beverage ";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

package hw_16_02_18.Coffee;

public abstract class Beverage {

    String description = "Unknown Drink";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

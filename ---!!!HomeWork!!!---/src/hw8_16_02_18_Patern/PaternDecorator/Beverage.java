package hw8_16_02_18_Patern.PaternDecorator;

public abstract class Beverage {

    String description = "Unknown Drink";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

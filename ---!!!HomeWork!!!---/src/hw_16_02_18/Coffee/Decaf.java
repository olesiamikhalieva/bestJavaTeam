package hw_16_02_18.Coffee;

public class Decaf extends Beverage {

    public Decaf() {
    description = "Decaf";
    }
    @Override
    public double cost() {
        return .99;
    }
}

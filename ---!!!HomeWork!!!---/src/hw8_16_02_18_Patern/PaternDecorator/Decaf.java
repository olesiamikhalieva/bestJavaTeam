package hw8_16_02_18_Patern.PaternDecorator;

public class Decaf extends Beverage {

    public Decaf() {
    description = "Decaf";
    }
    @Override
    public double cost() {
        return .99;
    }
}

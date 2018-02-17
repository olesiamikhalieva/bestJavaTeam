package hw_16_02_18.PaternDecorator;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

package hw8_16_02_18_Patern.PaternDecorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}

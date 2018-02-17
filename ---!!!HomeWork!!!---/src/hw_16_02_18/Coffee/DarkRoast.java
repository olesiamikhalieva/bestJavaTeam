package hw_16_02_18.Coffee;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}

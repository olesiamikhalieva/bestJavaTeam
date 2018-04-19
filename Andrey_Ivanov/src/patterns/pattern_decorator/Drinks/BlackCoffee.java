package patterns.pattern_decorator.Drinks;

public class BlackCoffee extends Beverage {

    public BlackCoffee() {
        description= "Black Coffee:";
    }

    @Override
    public double cost() {
        return 0;
    }
}

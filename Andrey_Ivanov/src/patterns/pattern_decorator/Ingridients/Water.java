package patterns.pattern_decorator.Ingridients;

import patterns.pattern_decorator.Drinks.Beverage;
import patterns.pattern_decorator.Drinks.CondimentDecorator;

public class Water extends CondimentDecorator {

    Beverage beverage;

    public Water(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Water -";
    }

    @Override
    public double cost() {
        return 0.1+beverage.cost();
    }
}

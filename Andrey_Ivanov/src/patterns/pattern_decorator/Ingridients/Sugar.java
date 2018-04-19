package patterns.pattern_decorator.Ingridients;

import patterns.pattern_decorator.Drinks.Beverage;
import patterns.pattern_decorator.Drinks.CondimentDecorator;

public class Sugar extends CondimentDecorator{

    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Sugar -";
    }

    @Override
    public double cost() {
        return 0.05+beverage.cost();
    }
}

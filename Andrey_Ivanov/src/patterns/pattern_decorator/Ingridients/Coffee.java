package patterns.pattern_decorator.Ingridients;

import patterns.pattern_decorator.Drinks.Beverage;
import patterns.pattern_decorator.Drinks.CondimentDecorator;

public class Coffee extends CondimentDecorator {

    Beverage beverage;

    public Coffee(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Coffee -";
    }

    @Override
    public double cost() {
        return 1.15+beverage.cost();
    }
}

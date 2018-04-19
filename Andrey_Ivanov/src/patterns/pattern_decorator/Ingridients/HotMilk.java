package patterns.pattern_decorator.Ingridients;

import patterns.pattern_decorator.Drinks.Beverage;
import patterns.pattern_decorator.Drinks.CondimentDecorator;

public class HotMilk extends CondimentDecorator{

    Beverage beverage;

    public HotMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Hot milk -";
    }

    @Override
    public double cost() {
        return 0.3+beverage.cost();
    }
}

package hw_13_02_18.MenuCoffee.Ingridients;

import hw_13_02_18.MenuCoffee.Drinks.Beverage;
import hw_13_02_18.MenuCoffee.Drinks.CondimentDecorator;

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

package hw_13_02_18.MenuCoffee.Ingridients;

import hw_13_02_18.MenuCoffee.Drinks.Beverage;
import hw_13_02_18.MenuCoffee.Drinks.CondimentDecorator;

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

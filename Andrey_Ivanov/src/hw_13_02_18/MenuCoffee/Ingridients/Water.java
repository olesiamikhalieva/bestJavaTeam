package hw_13_02_18.MenuCoffee.Ingridients;

import hw_13_02_18.MenuCoffee.Drinks.Beverage;
import hw_13_02_18.MenuCoffee.Drinks.CondimentDecorator;

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

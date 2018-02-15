package hw_13_02_18.MenuCoffee.Ingridients;

import hw_13_02_18.MenuCoffee.Drinks.Beverage;
import hw_13_02_18.MenuCoffee.Drinks.CondimentDecorator;

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

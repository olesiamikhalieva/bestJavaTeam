package hw_13_02_18.MenuCoffee.Drinks;

import com.sun.deploy.util.BlackList;

public class BlackCoffee extends Beverage {

    public BlackCoffee() {
        description= "Black Coffee:";
    }

    @Override
    public double cost() {
        return 0;
    }
}

package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.Chocolate;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Milk;

public class Mocaccino extends Beverage{
    private CoffeeAndWater coffeeAndWater;
    private Chocolate chocolate;
    private Milk milk1;
    private Milk milk2;

    public Mocaccino(String name, CoffeeAndWater coffeeAndWater, Chocolate chocolate, Milk milk1, Milk milk2) {
        super(name);
        this.coffeeAndWater = coffeeAndWater;
        this.chocolate = chocolate;
        this.milk1 = milk1;
        this.milk2 = milk2;
        super.setPrice(coffeeAndWater.getPrice()+chocolate.getPrice()+milk1.getPrice()+milk2.getPrice());
    }

    public int getPriceMocaccino() {

        return super.getPrice();
    }
}

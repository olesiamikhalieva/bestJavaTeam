package hw_09_02_18.Classes.Coffee;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Milk;

public class Cappuccino extends Beverage {
    private CoffeeAndWater coffeeAndWater;
    private Milk milk1;
    private Milk milk2;
    private Milk milk3;
    private Milk milk4;
    private Milk milk5;

    public Cappuccino(String name, CoffeeAndWater coffeeAndWater, Milk milk1, Milk milk2, Milk milk3, Milk milk4, Milk milk5) {
        super(name);
        this.coffeeAndWater = coffeeAndWater;
        this.milk1 = milk1;
        this.milk2 = milk2;
        this.milk3 = milk3;
        this.milk4 = milk4;
        this.milk5 = milk5;
        super.setPrice(coffeeAndWater.getPrice() + milk1.getPrice() + milk2.getPrice() + milk3.getPrice() + milk4.getPrice() + milk5.getPrice());
    }

    public int getPriceCappuccino() {
        return super.getPrice();
    }

    @Override
    public String  showComponents() {
       return coffeeAndWater.getName() + ", " + milk1.getName() + ", " + milk2.getName() + ", " + milk3.getName() + ", " + milk4.getName() + ", " + milk5.getName();
    }
}

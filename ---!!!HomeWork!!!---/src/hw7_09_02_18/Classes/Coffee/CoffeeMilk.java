package hw7_09_02_18.Classes.Coffee;

import hw7_09_02_18.Classes.Beverage;
import hw7_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw7_09_02_18.Classes.Ingredients.Milk;

public class CoffeeMilk extends Beverage{
    private CoffeeAndWater coffeeAndWater;
    private Milk milk;

    public CoffeeMilk(String  name, CoffeeAndWater coffeeAndWater,Milk milk) {
        super(name);
        this.coffeeAndWater = coffeeAndWater;
        this.milk = milk;
        super.setPrice(coffeeAndWater.getPrice() + milk.getPrice());
    }

    public int getPriceCoffeeMilk() {
        return super.getPrice();
    }

    @Override
    public String  showComponents() {
        return coffeeAndWater.getName() + ", " + milk.getName();
    }
}

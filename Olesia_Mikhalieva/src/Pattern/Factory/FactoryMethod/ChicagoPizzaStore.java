package Pattern.Factory.FactoryMethod;

public class ChicagoPizzaStore extends Pizza {
    public ChicagoPizzaStore() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sause";

        topping.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

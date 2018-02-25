package hw_16_02_18.PatternFactory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato";

        toppings.add("Shredded mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("cutting the pizza into square slice");
    }
}

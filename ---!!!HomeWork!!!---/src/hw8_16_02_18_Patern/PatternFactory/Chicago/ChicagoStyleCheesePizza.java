package hw8_16_02_18_Patern.PatternFactory.Chicago;

import hw8_16_02_18_Patern.PatternFactory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato";

        toppings.add("Shredded mozzarella Cheese");
    }

    void cut() {
        System.out.println("cutting the pizza into square slice");
    }
}

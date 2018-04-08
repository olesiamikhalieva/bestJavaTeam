package hw8_16_02_18.PatternFactory.Chicago;

import hw8_16_02_18.PatternFactory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni";
        dough = "Extra Thick Crust Dough Pepperoni";
        sauce = "Plum Tomato Pepperoni";

        toppings.add("Shredded mozzarella Cheese Pepperoni");
    }
}

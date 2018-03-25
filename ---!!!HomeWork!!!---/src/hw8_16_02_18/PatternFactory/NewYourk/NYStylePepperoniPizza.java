package hw8_16_02_18.PatternFactory.NewYourk;

import hw8_16_02_18.PatternFactory.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = " Pepperoni n";
        dough = " Pepperoni d";
        sauce = " Pepperoni s";

        toppings.add("Pepperoni");
    }
}

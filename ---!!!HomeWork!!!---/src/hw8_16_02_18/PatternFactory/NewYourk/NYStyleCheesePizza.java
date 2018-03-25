package hw8_16_02_18.PatternFactory.NewYourk;

import hw8_16_02_18.PatternFactory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style";
        dough = "thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated reggiano cheese");
    }
}

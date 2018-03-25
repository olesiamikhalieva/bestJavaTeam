package hw8_16_02_18.PatternFactory.NewYourk;

import hw8_16_02_18.PatternFactory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {

        name = "NY Style Veggie";
        dough = "thin crust dough Veggie";
        sauce = "Veggie sauce";

        toppings.add("Grated reggiano cheese");
    }
}

package hw_16_02_18.PatternFactory.NewYourk;

import hw_16_02_18.PatternFactory.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "Clam n";
        dough = "Clam d";
        sauce = "Clam s";

        toppings.add("Clam");
    }
}

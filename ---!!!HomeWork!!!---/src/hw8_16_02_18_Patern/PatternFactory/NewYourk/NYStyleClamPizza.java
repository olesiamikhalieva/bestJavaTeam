package hw8_16_02_18_Patern.PatternFactory.NewYourk;

import hw8_16_02_18_Patern.PatternFactory.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "Clam n";
        dough = "Clam d";
        sauce = "Clam s";

        toppings.add("Clam");
    }
}

package hw8_16_02_18.PatternFactory.Chicago;

import hw8_16_02_18.PatternFactory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {

        name = "Chicago Style Clam";
        dough = "Chicago thin crust dough Clam";
        sauce = "Chicago Clam sauce";

        toppings.add("Grated reggiano cheese Clam");
    }
}

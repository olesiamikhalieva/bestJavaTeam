package hw8_16_02_18_Patern.PatternFactory.Chicago;

import hw8_16_02_18_Patern.PatternFactory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {

        name = "Chicago Style Clam";
        dough = "Chicago thin crust dough Clam";
        sauce = "Chicago Clam sauce";

        toppings.add("Grated reggiano cheese Clam");
    }
}

package hw8_16_02_18_Patern.PatternFactory.Chicago;

import hw8_16_02_18_Patern.PatternFactory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {

        name = "Chicago Style Veggie";
        dough = "Chicago thin crust dough Veggie";
        sauce = "Chicago Veggie sauce";

        toppings.add("Grated reggiano cheese Veggie");
    }
}

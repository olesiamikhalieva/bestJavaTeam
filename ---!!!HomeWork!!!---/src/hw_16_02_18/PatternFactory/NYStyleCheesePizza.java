package hw_16_02_18.PatternFactory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style";
        dough = "thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated reggiano cheese");
    }
}

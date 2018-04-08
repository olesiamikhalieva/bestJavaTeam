package hw8_16_02_18.PatternFactory;

import hw8_16_02_18.PatternFactory.Chicago.ChicagoPizzaStore;
import hw8_16_02_18.PatternFactory.NewYourk.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName() + "\n" );

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

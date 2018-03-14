package Pattern.Factory.FactoryMethod;

import Pattern.Factory.FactoryMethod.ChicagoStylePizzaStore;
import Pattern.Factory.FactoryMethod.NYStylePizzaStore;
import Pattern.Factory.FactoryMethod.Pizza;
import Pattern.Factory.FactoryMethod.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza1.getName()+"\n");
    }
}

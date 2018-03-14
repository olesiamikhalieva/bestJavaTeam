package Pattern.Factory.AbstractFactory;

import Pattern.Factory.FactoryMethod.ChicagoStylePizzaStore;
import Pattern.Factory.FactoryMethod.NYStylePizzaStore;
import Pattern.Factory.FactoryMethod.Pizza;
import Pattern.Factory.FactoryMethod.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pattern.Factory.AbstractFactory.PizzaStore nyStore = new NYPizzaStore();

        Pattern.Factory.AbstractFactory.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

    }
}

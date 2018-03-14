package Pattern.Factory.FactoryMethod;

public class NYStylePizzaStore extends PizzaStore {
    Pizza pizza;

    @Override
    protected Pattern.Factory.FactoryMethod.Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        if (type.equals("peperroni")){
            pizza = new NYStylePeperoniPizza();
        }
        return pizza;
    }
}

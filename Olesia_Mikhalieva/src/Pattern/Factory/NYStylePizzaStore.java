package Pattern.Factory;

public class NYStylePizzaStore extends PizzaStore {
    Pizza pizza;

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        if (type.equals("peperroni")){
            pizza = new NYStylePeperoniPizza();
        }
        return pizza;
    }
}

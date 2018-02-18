package Pattern.Factory;

public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    protected Pizza createPizza(String type) {
            if (type.equals("cheese")){
                return new ChicagoStyleCheesePizza();
            }
            else if (type.equals("peperroni")){
                return new NYStylePeperoniPizza();
            }
            return pizza;
        }
    }


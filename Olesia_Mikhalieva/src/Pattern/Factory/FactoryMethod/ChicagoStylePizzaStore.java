package Pattern.Factory.FactoryMethod;

public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    protected Pattern.Factory.FactoryMethod.Pizza createPizza(String type) {
            if (type.equals("cheese")){
                return new ChicagoStyleCheesePizza();
            }
            else if (type.equals("peperroni")){
                return new NYStylePeperoniPizza();
            }
            return pizza;
        }
    }


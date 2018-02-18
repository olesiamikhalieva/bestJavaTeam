package hw_16_02_18.PatternFactory.Chicago;

import hw_16_02_18.PatternFactory.Pizza;
import hw_16_02_18.PatternFactory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }
        else if(item.equals("cheese")){
            return new ChicagoStylePepperoniPizza();
        }
        else return null;
    }
}

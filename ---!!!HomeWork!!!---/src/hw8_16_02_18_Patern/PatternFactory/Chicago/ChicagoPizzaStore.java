package hw8_16_02_18_Patern.PatternFactory.Chicago;

import hw8_16_02_18_Patern.PatternFactory.Pizza;
import hw8_16_02_18_Patern.PatternFactory.PizzaStore;

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

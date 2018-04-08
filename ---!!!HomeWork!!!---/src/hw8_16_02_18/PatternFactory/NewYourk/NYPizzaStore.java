package hw8_16_02_18.PatternFactory.NewYourk;

import hw8_16_02_18.PatternFactory.Pizza;
import hw8_16_02_18.PatternFactory.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }
        else if(item.equals("cheese")){
            return new NYStylePepperoniPizza();
        }
        else return null;
    }
}

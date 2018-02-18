package hw_16_02_18.PatternFactory;

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
            return new NYStylePapperoniPizza();
        }
        else return null;
    }
}

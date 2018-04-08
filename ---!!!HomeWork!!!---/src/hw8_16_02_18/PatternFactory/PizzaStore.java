package hw8_16_02_18.PatternFactory;

public abstract class PizzaStore{

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}

package Pattern.Factory.AbstractFactory;

import Pattern.Factory.FactoryMethod.Pizza;

public abstract class PizzaStore {


    public Pattern.Factory.AbstractFactory.Pizza orderPizza(String type) {
        Pattern.Factory.AbstractFactory.Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pattern.Factory.AbstractFactory.Pizza createPizza(String type);
}

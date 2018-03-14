package Pattern.Factory.AbstractFactory;

import Pattern.Factory.FactoryMethod.PizzaStore;

public class NYPizzaStore extends Pattern.Factory.AbstractFactory.PizzaStore {

    @Override
    protected Pizza createPizza (String item){
        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        if (item.equals("cheese")){

            pizza = new CheesePIzzza(ingridientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        if (item.equals("veggie")){

            pizza = new CheesePIzzza(ingridientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        if (item.equals("clam")){

            pizza = new CheesePIzzza(ingridientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        if (item.equals("pepperoni")){

            pizza = new CheesePIzzza(ingridientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}

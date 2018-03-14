package Pattern.Factory.AbstractFactory;

import Pattern.Factory.AbstractFactory.Ingredients.*;

public abstract class Pizza {
    int item;
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "item=" + item +
                '}';
    }
}

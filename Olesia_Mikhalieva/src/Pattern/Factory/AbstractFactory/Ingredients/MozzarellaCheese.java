package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Cheese;

public class MozzarellaCheese implements Cheese {

    @Override
    public void getNameCheese() {
        System.out.println("Mozzarella cheese");
    }
}

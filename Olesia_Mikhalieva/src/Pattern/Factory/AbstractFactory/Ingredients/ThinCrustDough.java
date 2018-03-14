package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public void getNameDough() {
        System.out.println("Thin crust dough");
    }
}

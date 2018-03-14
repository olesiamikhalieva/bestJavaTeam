package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Dough;

public class ThickCrustDough implements Dough {
    @Override
    public void getNameDough() {
        System.out.println("Thick crust dough");
    }
}

package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Clam;

public class FreshClams implements Clam {
    @Override
    public void getNameClam() {
        System.out.println("Fresh clams");
    }
}

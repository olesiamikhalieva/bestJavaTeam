package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Sauce;

public class MarinaraSauce implements Sauce {
    @Override
    public void getNameSauce() {
        System.out.println("Marinara sauce");
    }
}

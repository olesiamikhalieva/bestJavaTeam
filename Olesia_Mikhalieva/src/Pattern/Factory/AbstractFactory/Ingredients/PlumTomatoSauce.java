package Pattern.Factory.AbstractFactory.Ingredients;

import Pattern.Factory.AbstractFactory.Ingredients.Sauce;

public class PlumTomatoSauce implements Sauce {
    @Override
    public void getNameSauce() {
        System.out.println("Plum tomato sauce");
    }
}

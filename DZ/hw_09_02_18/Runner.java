package hw_09_02_18;

import hw_09_02_18.Classes.Coffee.Americano;
import hw_09_02_18.Classes.Ingredients.CoffeeAndWater;
import hw_09_02_18.Classes.Ingredients.Water;

public class Runner {
    public static void main(String[] args) {
        Americano americano = new Americano(new CoffeeAndWater(), new Water(), new Water());
        System.out.println("Американо стоит " + americano.getPriceAmericano() + "грн");
    }
}

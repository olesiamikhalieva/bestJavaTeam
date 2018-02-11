package hw_10_02_18.Drinks;

import java.util.Arrays;

public class DrinkMenu {

    Amerikano amerikano = new Amerikano();
    Capuchino capuchino = new Capuchino();
    CoffeWithMilk coffeWithMilk = new CoffeWithMilk();
    Mokachino mokachino = new Mokachino();
    BlackTea blackTea = new BlackTea();
    GreenTea greenTea = new GreenTea();
    BergamotTea bergamotTea = new BergamotTea();
    InterfaceDrinks [] drinksMass = {amerikano, capuchino,mokachino,coffeWithMilk,bergamotTea,blackTea,greenTea};

    public Amerikano getAmerikano() {
        return amerikano;
    }

    public Capuchino getCapuchino() {
        return capuchino;
    }

    public CoffeWithMilk getCoffeWithMilk() {
        return coffeWithMilk;
    }

    public Mokachino getMokachino() {
        return mokachino;
    }

    public BlackTea getBlackTea() {
        return blackTea;
    }

    public GreenTea getGreenTea() {
        return greenTea;
    }

    public BergamotTea getBergamotTea() {
        return bergamotTea;
    }

    public InterfaceDrinks[] getDrinksMass() {
        return drinksMass;
    }

}

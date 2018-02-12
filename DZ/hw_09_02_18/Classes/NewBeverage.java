package hw_09_02_18.Classes;


import hw_09_02_18.Classes.Ingredients.*;

import java.util.Arrays;

public class NewBeverage extends Beverage {
    private Beverage[] componentsMass = new Beverage[1];


    public NewBeverage() {
        super("Ваш напиток");
    }


    public void setNewComponents(Beverage components) {
        componentsMass = addNewComponents(components);
    }

    private Beverage[] addNewComponents(Beverage componentForBeverage) {
        for (int i = 0; i < componentsMass.length; i++) {
            if (componentsMass[i] == null) {
                componentsMass[i] = componentForBeverage;
                Beverage[] newBeverageMass = Arrays.copyOf(componentsMass, componentsMass.length + 1);
                newBeverageMass[i] = componentForBeverage;
                componentsMass = newBeverageMass;
                break;
            }
        }
        return componentsMass;
    }

    public void showPriceAndNameForNewBeverage() {
        int priceNewBeverage = 0;
        String nameNewBeverage = "";
        for (int i = 0; i < componentsMass.length; i++) {
            if (componentsMass[i] != null) {
                priceNewBeverage += componentsMass[i].getPrice();
                nameNewBeverage += componentsMass[i].getName() + " \n ";
            }
        }
        System.out.println("Вы заказали: " + nameNewBeverage + "Стоимостью " + priceNewBeverage + "грн");
    }
}
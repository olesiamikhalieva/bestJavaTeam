package hw_09_02_18.Classes;


import hw_09_02_18.Classes.Ingredients.*;

import java.util.Arrays;

public class NewBeverage extends Beverage {

    private Beverage beverage = new Beverage();

    private Beverage[] componentsMass = new Beverage[1];


    public NewBeverage() {
        super("Бурда");
    }


    public void setNewComponents(Beverage components) {
        this.beverage = components;
        componentsMass = addNewComponents(beverage);
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
//            if (i == componentsMass.length - 1) {
//                Beverage[] newBeverageMass = Arrays.copyOf(componentsMass, componentsMass.length + 1);
//                newBeverageMass[i] = componentForBeverage;
//                componentsMass = newBeverageMass;
//            }
        }
        return componentsMass;
    }

    public void showPriceForNewBeverage() {
        int priceNewBeverage = 0;
        for (int i = 0; i < componentsMass.length; i++) {
            if (componentsMass[i] != null) {
                priceNewBeverage += componentsMass[i].getPrice();
            }
        }
        System.out.println("Стоимость вашего напитка: " + priceNewBeverage);
    }
}
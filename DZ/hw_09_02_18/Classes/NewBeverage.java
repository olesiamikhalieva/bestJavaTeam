package hw_09_02_18.Classes;


import hw_09_02_18.Classes.Ingredients.*;

import java.util.Arrays;

public class NewBeverage extends Beverage {

    private Bergamot bergamot = new Bergamot();
    private Chocolate chocolate = new Chocolate();
    private CoffeeAndWater coffeeAndWater = new CoffeeAndWater();
    private LeavesBlackTea leavesBlackTea = new LeavesBlackTea();
    private LeavesGreenTea leavesGreenTea = new LeavesGreenTea();
    private Milk milk = new Milk();
    private Sugar sugar = new Sugar();
    private Water water = new Water();
    private Beverage beverage = new Beverage();

    private Beverage[] componentsMass = new Beverage[1];


    public NewBeverage() {
        super("Бурда");
    }

    public Bergamot getBergamot() {
        return bergamot;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public CoffeeAndWater getCoffeeAndWater() {
        return coffeeAndWater;
    }

    public LeavesBlackTea getLeavesBlackTea() {
        return leavesBlackTea;
    }

    public LeavesGreenTea getLeavesGreenTea() {
        return leavesGreenTea;
    }

    public Milk getMilk() {
        return milk;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public Water getWater() {
        return water;
    }

    //-------------------------------------------Граница сетеров и гетеров-------------------------------------------
    public void setBergamot(Bergamot bergamot) {
        this.bergamot = bergamot;
        componentsMass = addNewComponents(bergamot);
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
        componentsMass = addNewComponents(chocolate);
    }

    public void setCoffeeAndWater(CoffeeAndWater coffeeAndWater) {
        this.coffeeAndWater = coffeeAndWater;
        componentsMass = addNewComponents(coffeeAndWater);
    }

    public void setLeavesBlackTea(LeavesBlackTea leavesBlackTea) {
        this.leavesBlackTea = leavesBlackTea;
        componentsMass = addNewComponents(leavesBlackTea);
    }

    public void setLeavesGreenTea(LeavesGreenTea leavesGreenTea) {
        this.leavesGreenTea = leavesGreenTea;
        componentsMass = addNewComponents(leavesGreenTea);
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
        componentsMass = addNewComponents(milk);
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
        componentsMass = addNewComponents(sugar);
    }

    public void setWater(Water water) {
        this.water = water;
        componentsMass = addNewComponents(water);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    private Beverage[] addNewComponents(Beverage componentForBeverage) {
        for (int i = 0; i < componentsMass.length; i++) {
            if (componentsMass[i] == null) {
                componentsMass[i] = componentForBeverage;
            } else {
                Beverage[] newBeverageMass = Arrays.copyOf(componentsMass, componentsMass.length + 1);
                newBeverageMass[i] = componentForBeverage;
                componentsMass = newBeverageMass;
            }
        }
        return componentsMass;
    }

    public Beverage[] getComponentsMass() {
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
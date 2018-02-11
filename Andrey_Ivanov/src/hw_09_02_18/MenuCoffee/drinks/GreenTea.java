package hw_09_02_18.MenuCoffee.drinks;

import hw_09_02_18.MenuCoffee.ingredients.BlackTea1;
import hw_09_02_18.MenuCoffee.ingredients.GreenTea1;
import hw_09_02_18.MenuCoffee.ingredients.Sugar;
import hw_09_02_18.MenuCoffee.ingredients.Water;

public class GreenTea extends DefaultDrink{

    private Water water;
    private Sugar sugar;
    private GreenTea1 greenTea;

    public GreenTea(String name,int water, int sugar, int greenTea) {
        super.setName(name);
        this.water = new Water(water);
        this.sugar = new Sugar(sugar);
        this.greenTea = new GreenTea1(greenTea);
        setPrice();
    }
    public int getWater() {
        return water.getCount();
    }

    public void setWater(int water) {
        this.water.setCount(water);
        setPrice();
    }

    public int getSugar() {
        return sugar.getCount();
    }

    public void setSugar(int sugar) {
        this.sugar.setCount(sugar);
        setPrice();
    }

    public int getGreenTea() {
        return greenTea.getCount();
    }

    public void setGreenTea(int coffee) {
        this.greenTea.setCount(coffee);
        setPrice();
    }
    public void setPrice(){
        super.setPrice(water.getPrice() + greenTea.getPrice() + sugar.getPrice());
    }
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName()+"-Цена:"+getPrice();
    }
}



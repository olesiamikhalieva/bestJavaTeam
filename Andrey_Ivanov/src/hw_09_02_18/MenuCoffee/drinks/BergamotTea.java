package hw_09_02_18.MenuCoffee.drinks;

import hw_09_02_18.MenuCoffee.ingredients.BergamotTea1;
import hw_09_02_18.MenuCoffee.ingredients.BlackTea1;
import hw_09_02_18.MenuCoffee.ingredients.Sugar;
import hw_09_02_18.MenuCoffee.ingredients.Water;

public class BergamotTea extends DefaultDrink{
    private Water water;
    private Sugar sugar;
    private BergamotTea1 bergamotTea;

    public BergamotTea(String name,int water, int sugar, int bergamotTea) {
        super.setName(name);
        this.water = new Water(water);
        this.sugar = new Sugar(sugar);
        this.bergamotTea = new BergamotTea1(bergamotTea);
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

    public int getBergamotTea() {
        return bergamotTea.getCount();
    }

    public void setBergamotTea(int coffee) {
        this.bergamotTea.setCount(coffee);
        setPrice();
    }
    public void setPrice(){
        super.setPrice(water.getPrice() + bergamotTea.getPrice() + sugar.getPrice());
    }
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName()+"-Цена:"+getPrice();
    }
}


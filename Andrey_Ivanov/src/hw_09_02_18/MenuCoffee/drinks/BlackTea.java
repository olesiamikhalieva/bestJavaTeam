package hw_09_02_18.MenuCoffee.drinks;

import hw_09_02_18.MenuCoffee.ingredients.BlackTea1;
import hw_09_02_18.MenuCoffee.ingredients.Sugar;
import hw_09_02_18.MenuCoffee.ingredients.Water;

public class BlackTea extends DefaultDrink{

    private Water water;
    private Sugar sugar;
    private BlackTea1 blackTea;

    public BlackTea(String name,int water, int sugar, int blackTea) {
        super.setName(name);
        this.water = new Water(water);
        this.sugar = new Sugar(sugar);
        this.blackTea = new BlackTea1(blackTea);
        setPrice();
    }
    public int getWater() {
        return water.getCount();
    }

    public void setWater(int water) {
        this.water.setCount(water);

    }

    public int getSugar() {
        return sugar.getCount();
    }

    public void setSugar(int sugar) {
        this.sugar.setCount(sugar);

    }

    public int getBlackTea() {
        return blackTea.getCount();
    }

    public void setBlackTea(int coffee) {
        this.blackTea.setCount(coffee);

    }
    public void setPrice(){
        super.setPrice(water.getPrice() + blackTea.getPrice() + sugar.getPrice());
    }
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName()+"-Цена:"+getPrice();
    }
}



package hw_09_02_18.MenuCoffee.drinks;

import hw_09_02_18.MenuCoffee.ingredients.Coffee;
import hw_09_02_18.MenuCoffee.ingredients.HotMilk;
import hw_09_02_18.MenuCoffee.ingredients.Sugar;
import hw_09_02_18.MenuCoffee.ingredients.Water;

public class Cappuccino extends DefaultDrink{

    private HotMilk hotMilk;
    private Sugar sugar;
    private Coffee coffee;

    public Cappuccino(String name,int hotMilk, int sugar, int coffee) {
        super.setName(name);
        this.hotMilk = new HotMilk(hotMilk);
        this.sugar = new Sugar(sugar);
        this.coffee = new Coffee(coffee);
        setPrice();
    }

    public int getHotMilk() {
        return hotMilk.getCount();
    }

    public void setHotMilk(int water) {
        this.hotMilk.setCount(water);

    }

    public int getSugar() {
        return sugar.getCount();
    }

    public void setSugar(int sugar) {
        this.sugar.setCount(sugar);

    }

    public int getCoffee() {
        return coffee.getCount();
    }

    public void setCoffee(int coffee) {
        this.coffee.setCount(coffee);

    }
    public void setPrice(){
        super.setPrice(hotMilk.getPrice() + coffee.getPrice() + sugar.getPrice());
    }
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName()+"-Цена:"+getPrice();
    }
}

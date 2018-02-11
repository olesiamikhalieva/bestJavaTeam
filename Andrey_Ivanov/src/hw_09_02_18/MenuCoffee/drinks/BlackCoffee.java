package hw_09_02_18.MenuCoffee.drinks;

import hw_09_02_18.MenuCoffee.ingredients.Coffee;
import hw_09_02_18.MenuCoffee.ingredients.Sugar;
import hw_09_02_18.MenuCoffee.ingredients.Water;

public class BlackCoffee extends DefaultDrink{

    private Water water;
    private Sugar sugar;
    private Coffee coffee;

    public BlackCoffee(String name,int water, int sugar, int coffee) {
        super.setName(name);
        this.water = new Water(water);
        this.sugar = new Sugar(sugar);
        this.coffee = new Coffee(coffee);
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

    public int getCoffee() {
        return coffee.getCount();
    }

    public void setCoffee(int coffee) {
        this.coffee.setCount(coffee);

    }
    public void setPrice(){
        super.setPrice(water.getPrice() + coffee.getPrice() + sugar.getPrice());
    }
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName()+"-Цена:"+getPrice();
    }
}

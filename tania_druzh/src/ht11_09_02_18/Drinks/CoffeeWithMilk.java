package ht11_09_02_18.Drinks;

import ht11_09_02_18.Ingredients.Coffee;
import ht11_09_02_18.Ingredients.Milk;
import ht11_09_02_18.Ingredients.Sugar;
import ht11_09_02_18.Ingredients.Water;

public class CoffeeWithMilk extends Drink {
    private Water water;
    private Coffee coffee;
    private Sugar sugar;
    private Milk milk;

    public CoffeeWithMilk(int water, int coffee, int sugar, int milk) {
        this.water = new Water(water);
        this.coffee = new Coffee(coffee);
        this.sugar = new Sugar(sugar);
        this.milk = new Milk(milk);
        setName();
        setPrice();
    }

    public int getWater() {
        return water.getCount();
    }

    public void setWater(int water) {
        this.water.setCount(water);
        setPrice();
    }

    public int getCoffee() {
        return coffee.getCount();
    }

    public void setCoffee(int coffee) {
        this.coffee.setCount(coffee);
        setPrice();
    }

    public int getSugar() {
        return sugar.getCount();
    }

    public void setSugar(int sugar) {
        this.sugar.setCount(sugar);
        setPrice();
    }

    public int getMilk() {
        return milk.getCount();
    }

    public void setMilk(int milk) {
        this.milk.setCount(milk);
        setPrice();
    }

    public void setName(){
        super.setName("Coffee with milk");
    }

    public void setPrice(){
        super.setPrice(water.getPrice() + coffee.getPrice() + sugar.getPrice() + milk.getPrice());
    }

    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                "water=" + water.getCount() +
                ", coffee=" + coffee.getCount() +
                ", sugar=" + sugar.getCount() +
                ", milk=" + milk.getCount() +
                '}';
    }
}

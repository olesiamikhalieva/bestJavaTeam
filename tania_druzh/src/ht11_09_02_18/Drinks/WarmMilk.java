package ht11_09_02_18.Drinks;

import ht11_09_02_18.Ingredients.Coffee;
import ht11_09_02_18.Ingredients.Milk;
import ht11_09_02_18.Ingredients.Sugar;
import ht11_09_02_18.Ingredients.Water;

public class WarmMilk extends Drink {
    private Milk milk;

    public WarmMilk(int milk) {
        this.milk = new Milk(milk);
        setName();
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
        super.setName("Warm milk");
    }

    public void setPrice(){
        super.setPrice(milk.getPrice());
    }

    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                ", milk=" + milk.getCount() +
                '}';
    }
}

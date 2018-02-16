package ht12_13_02_18.t2.Ingredients;

import ht12_13_02_18.t2.Drinks.Drink;

public class Sugar extends Ingredients {

    private static int price = 2;
    private Drink drink;

    public Sugar(Drink drink) {
        this.drink = drink;
    }

    public int getPrice() {
        return drink.getPrice() + price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String getName() {
        return drink.getName() + " Sugar";
    }

}

package hw_10_02_18.Drinks;

import hw_10_02_18.Products.SetProductPrice;

public class BlackTea implements InterfaceDrinks{
    private String name = "Black tea";
    private double primeCost;
    private int price;
    SetProductPrice setProductPrice = new SetProductPrice();


    private double primeCost() {
        this.primeCost = setProductPrice.getWater().getPrice()+setProductPrice.getBlackTea().getPrice();
        return primeCost;
    }

    public double getPrice() {
        this.price = (int) (primeCost()*1.5);
        return price;
    }

    public String getName() {
        return name;
    }
}

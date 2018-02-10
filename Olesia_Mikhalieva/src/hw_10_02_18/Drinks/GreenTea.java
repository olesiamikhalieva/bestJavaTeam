package hw_10_02_18.Drinks;

import hw_10_02_18.Products.SetProductPrice;

public class GreenTea implements InterfaceDrinks {
    private String name = "Green tea";
    private double primeCost;
    private int price;
    SetProductPrice setProductPrice = new SetProductPrice();


    private double primeCost() {
        this.primeCost = setProductPrice.getWater().getPrice()+setProductPrice.getGreenTea().getPrice();
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

package hw_10_02_18.Drinks;

import hw_10_02_18.Products.SetProductPrice;


public class Amerikano implements InterfaceDrinks{
    private String name = "Amerikano";
    private double primeCost;
    private int price;
    SetProductPrice setProductPrice = new SetProductPrice();


    private double primeCost() {
        this.primeCost = setProductPrice.getWater().getPrice()+setProductPrice.getCoffeeEcpresso().getPrice();
        return primeCost;
    }

    public double getPrice() {
        this.price =(int) (primeCost() *2);
        return price;
    }

    public String getName() {
        return name;
    }
}

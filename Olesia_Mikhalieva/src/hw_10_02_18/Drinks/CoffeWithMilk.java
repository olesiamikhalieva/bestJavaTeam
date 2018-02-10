package hw_10_02_18.Drinks;

import hw_10_02_18.Products.SetProductPrice;

public class CoffeWithMilk  implements InterfaceDrinks{
    private String name = "Coffe with milk";
    private double primeCost;
    private int price;
    SetProductPrice setProductPrice = new SetProductPrice();


    private double primeCost() {
        this.primeCost = setProductPrice.getWater().getPrice()+setProductPrice.getCoffeeEcpresso().getPrice()+setProductPrice.getMilk().getPrice();
        return primeCost;
    }

    public double getPrice() {
        this.price = (int)( primeCost()*1.8);
        return price;
    }

    public String getName() {
        return name;
    }
}

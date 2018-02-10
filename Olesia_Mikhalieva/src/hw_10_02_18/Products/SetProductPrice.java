package hw_10_02_18.Products;


public class SetProductPrice extends Products{

    BlackTea blackTea = new BlackTea(50);
    GreenTea greenTea = new GreenTea(50);
    BergamotTea bergamotTea = new BergamotTea(60);
    Sugar sugar = new Sugar(25);
    Water water = new Water(20);
    Milk milk = new Milk(25);
    CoffeeEcpresso coffeeEcpresso = new CoffeeEcpresso(150);
    Chocolate chocolate = new Chocolate(30);

    public BlackTea getBlackTea() {
        return blackTea;
    }

    public GreenTea getGreenTea() {
        return greenTea;
    }

    public BergamotTea getBergamotTea() {
        return bergamotTea;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public Water getWater() {
        return water;
    }

    public Milk getMilk() {
        return milk;
    }

    public CoffeeEcpresso getCoffeeEcpresso() {
        return coffeeEcpresso;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }
}

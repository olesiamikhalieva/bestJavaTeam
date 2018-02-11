package hw_10_02_18.Products;

public class CoffeeEcpresso implements Products{
    private String name = "Espresso";
    private final int volueGr = 10;
    private double priceOf100Gr;

    public CoffeeEcpresso(double price) {
        this.priceOf100Gr = price;
    }

    public int getVolueGr() {
        return volueGr;
    }

    public double getPrice() {
        double priceOf10Gr = this.priceOf100Gr/10;
        return priceOf10Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

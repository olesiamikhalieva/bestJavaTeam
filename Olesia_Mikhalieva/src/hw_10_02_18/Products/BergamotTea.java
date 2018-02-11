package hw_10_02_18.Products;

public class BergamotTea implements Products{
    private String name = "Bergamot tea";
    private double priceOf100Gr;

    public BergamotTea(double price) {
        this.priceOf100Gr = price;
    }


    public double getPrice() {
        double priceOf10Gr = this.priceOf100Gr/5;
        return priceOf10Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }

    public String getName() {
        return this.name;
    }
}

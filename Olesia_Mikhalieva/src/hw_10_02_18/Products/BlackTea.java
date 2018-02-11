package hw_10_02_18.Products;

public class BlackTea implements Products{
    private String name = "Black tea";

    private double priceOf100Gr;

    public BlackTea(double price) {
        this.priceOf100Gr = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        double priceOf10Gr = this.priceOf100Gr/5;
        return priceOf10Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }

}

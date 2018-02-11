package hw_10_02_18.Products;

public class GreenTea implements Products{

    private String name = "Green tea";
    private double priceOf100Gr;

    public GreenTea(double price) {
        this.priceOf100Gr = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        double priceOf20Gr = this.priceOf100Gr/5;
        return priceOf20Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }


}

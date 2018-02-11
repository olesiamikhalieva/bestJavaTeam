package hw_10_02_18.Products;

public class Chocolate implements  Products{
    private String name = "Chocolate";
    private double priceOf100Gr;

    public Chocolate(double price) {
        this.priceOf100Gr = price;
    }

    public double getPrice() {
        double priceOf50Gr = this.priceOf100Gr/2;
        return priceOf50Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

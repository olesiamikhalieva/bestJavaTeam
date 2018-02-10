package hw_10_02_18.Products;

public class Milk extends Products{

    private double priceOf1Litr;

    public Milk(double price) {
        this.priceOf1Litr = price;
    }

    public double getPrice() {
        double priceOf100Ml = this.priceOf1Litr/10;
        return priceOf100Ml;
    }

    public void setPrice(double price) {
        this.priceOf1Litr = price;
    }

}

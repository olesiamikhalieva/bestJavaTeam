package hw_10_02_18.Products;

public class GreenTea extends Products{

    private double priceOf100Gr;

    public GreenTea(double price) {
        this.priceOf100Gr = price;
    }

    public double getPrice() {
        double priceOf20Gr = this.priceOf100Gr/5;
        return priceOf20Gr;
    }

    public void setPrice(double price) {
        this.priceOf100Gr = price;
    }

}

package hw_10_02_18.Products;

public class Sugar implements Products{

    private String name = "Sugar";
    private double priceOf1Sugar;

    public Sugar(double price) {
        this.priceOf1Sugar = price;
    }

    public double getPrice() {
        return priceOf1Sugar*2;
    }

    public void setPrice(double price) {
        this.priceOf1Sugar = price;
    }

    @Override
    public String getName() {
        return name;
    }
}

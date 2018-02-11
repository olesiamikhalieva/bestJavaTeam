package hw_10_02_18.Products;

public class Water implements Products{

    private String name = "Water";
    private double priceOf1000Litr;

    public Water(double price) {
        this.priceOf1000Litr = price;
    }

    public double getPrice() {
        double priceOf1Litr = this.priceOf1000Litr/1000;
        return priceOf1Litr;
    }

    public void setPrice(double price) {
        this.priceOf1000Litr = price;
    }

    @Override
    public String getName() {
        return name;
    }
}

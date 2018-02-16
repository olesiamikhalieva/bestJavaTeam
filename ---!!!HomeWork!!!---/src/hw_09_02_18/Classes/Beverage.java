package hw_09_02_18.Classes;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage() {
    }

    public Beverage(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String showComponents();
}

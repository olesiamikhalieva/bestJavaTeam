package ht12_13_02_18.t2.Drinks;

public class Drink {
    private String name;
    private int price;

    public Drink() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink " +
                "name='" + name + '\'';
    }
}

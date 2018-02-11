package ht11_09_02_18.Ingredients;

public class Milk {
    private int count;
    private static int price = 3;

    public Milk() {
    }

    public Milk(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price * count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "count=" + count +
                ", price=" + price +
                '}';
    }


}

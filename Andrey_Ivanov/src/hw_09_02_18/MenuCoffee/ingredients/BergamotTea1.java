package hw_09_02_18.MenuCoffee.ingredients;

public class BergamotTea1 {
    private int count;
    private static int price=4;

    public BergamotTea1() {
    }

    public BergamotTea1(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price*count;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

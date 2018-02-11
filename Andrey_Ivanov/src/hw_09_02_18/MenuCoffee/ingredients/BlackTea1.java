package hw_09_02_18.MenuCoffee.ingredients;

public class BlackTea1 {
    private int count;
    private static int price=3;

    public BlackTea1() {
    }

    public BlackTea1(int count) {
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


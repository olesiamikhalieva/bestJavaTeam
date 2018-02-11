package hw_09_02_18.MenuCoffee.ingredients;

public class HotMilk {

    private int count;
    private static int price=4;

    public HotMilk() {
    }

    public HotMilk(int count) {
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

package hw_09_02_18.MenuCoffee.ingredients;

public class Coffee {

    private int count;
    private int price=5;

    public Coffee() {
    }

    public Coffee(int count) {
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

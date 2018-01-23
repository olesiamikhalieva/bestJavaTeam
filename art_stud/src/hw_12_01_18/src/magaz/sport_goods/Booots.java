package hw_12_01_18.src.magaz.sport_goods;

/**
 * Created by java on 19.01.2018.
 */
public class Booots {

    private int size;
    private String brend;
    private int price;
    private int count;



    public Booots() {
    }

    public Booots(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Booots(int size, String brend, int price) {
        this.size = size;
        this.brend = brend;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

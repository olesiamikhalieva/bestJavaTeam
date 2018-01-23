package magaz.sport_goods;

/**
 * Created by java on 19.01.2018.
 */
public class Dress {

    private int size;
    private String brend;
    private int price;
    private  int count;

    private Info info;


    public Dress() {
    }

    public Dress(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Dress(int size, String brend, int price) {
        this.size = size;
        this.brend = brend;
        this.price = price;
    }

    public Dress(int size, String brend, int price, int count, Info info) {
        this.size = size;
        this.brend = brend;
        this.price = price;
        this.count = count;
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
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

package ht11_09_02_18.Ingredients;

public class MilkyFoam {
    private int count;
    private static int price = 4;

    public MilkyFoam() {
    }

    public MilkyFoam(int count) {
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
        return "Milky foam{" +
                "count=" + count +
                ", price=" + price +
                '}';
    }


}

package hw_23_01_18.Comp;

public class HDD {
    private String brand;
    private String size;

    public HDD() {
    }

    public HDD(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

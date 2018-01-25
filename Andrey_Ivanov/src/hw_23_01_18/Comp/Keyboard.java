package hw_23_01_18.Comp;

public class Keyboard {
    private String color;
    private String brand;

    public Keyboard() {
    }

    public Keyboard(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

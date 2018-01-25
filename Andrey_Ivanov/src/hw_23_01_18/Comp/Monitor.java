package hw_23_01_18.Comp;

public class Monitor {
    private String brand;
    private int size;
    private boolean ledIllumination;//Led подсветка

    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public boolean isLedIllumination() {
        return ledIllumination;
    }

    public void setLedIllumination(boolean ledIllumination) {
        if (this.getBrand() == "Sony")
            this.ledIllumination = true;
    }

    public Monitor() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

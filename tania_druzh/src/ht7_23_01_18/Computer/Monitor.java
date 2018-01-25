package ht7_23_01_18.Computer;

public class Monitor {
    private String model;
    private int diagonal;

    public Monitor() {
    }

    public Monitor(String model, int diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}

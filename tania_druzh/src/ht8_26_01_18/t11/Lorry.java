package ht8_26_01_18.t11;

public class Lorry {
    private String tradeMark;
    private float weight;
    private int power;
    private int carryingCapacity;

    public Lorry() {
    }

    public Lorry(String tradeMark, int carryingCapacity) {
        this.tradeMark = tradeMark;
        this.carryingCapacity = carryingCapacity;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}

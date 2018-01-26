package ht8_26_01_18.t11;

public class Car {
    private String tradeMark;
    private float weight;
    private int power;

    public Car() {
    }

    public Car(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

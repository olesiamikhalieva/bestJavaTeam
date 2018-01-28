package hw_26_01_18.Car;

public class Car {
    private String attribut;
    private int weight;
    private int power;
    private  int carryingCapacity;

    public Car() {
    }

    public Car(String attribut, int power, int carryingCapacity) {
        this.attribut = attribut;
        this.power = power;
        this.carryingCapacity = carryingCapacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getAttribut() {
        return attribut;
    }

    public void setAttribut(String attribut) {
        this.attribut = attribut;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

}

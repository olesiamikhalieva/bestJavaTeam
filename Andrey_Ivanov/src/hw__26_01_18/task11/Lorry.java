package hw__26_01_18.task11;

public class Lorry extends Car{

    public int carryingCapacity;

    public Lorry() {
    }

    public Lorry(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}


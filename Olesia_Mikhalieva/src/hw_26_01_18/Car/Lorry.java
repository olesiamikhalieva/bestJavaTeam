package hw_26_01_18.Car;

public class Lorry extends Car {
   private int carryingCapacityLorry;
   private String attribut;

    @Override
    public void setPower(int power) {
        setPower(power*2);
    }

    @Override
    public int getPower() {
        return getPower();
    }


    @Override
    public int getCarryingCapacity() {
        if (carryingCapacityLorry>100){
            System.out.println("it's hard car with capacity: ");
        }
        return super.getCarryingCapacity();
    }

    @Override
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacityLorry = carryingCapacity;
        super.setCarryingCapacity(carryingCapacity);
    }

    @Override
    public String getAttribut() {
        return super.getAttribut();
    }

    @Override
    public void setAttribut(String attribut) {
        super.setAttribut(attribut+2);
    }
}

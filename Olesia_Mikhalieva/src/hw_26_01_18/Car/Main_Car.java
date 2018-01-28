package hw_26_01_18.Car;

public class Main_Car {
    public static void main(String[] args) {
        Car car = new Car("Audi",400,150);
        System.out.println(car.getAttribut()+" "+car.getCarryingCapacity());
        Lorry lorry = new Lorry();
        lorry.setAttribut("BMW");
        System.out.println(lorry.getAttribut());
        lorry.setCarryingCapacity(560);
        System.out.print(lorry.getCarryingCapacity());
    }
}

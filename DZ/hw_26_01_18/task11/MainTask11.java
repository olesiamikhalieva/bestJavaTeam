package task11;

public class MainTask11 {
    public static void main(String[] args) {

        Larry larry = new Larry();
        larry.setCarryingCapacity(1000);
        larry.setBrand("Василий Петрович");

        System.out.println(larry.getCarryingCapacity());
        System.out.println(larry.getBrand());

        larry.changeCarryingCapacity('+', 200);
        System.out.println(larry.getCarryingCapacity());

        larry.setNewBrand("Toyota");
        System.out.println(larry.getBrand());

        Car car = new Car("Гена", 2000, 500);
        System.out.println(car.getPower());
        car.changePower('+', 50);
        System.out.println(car.getPower());
    }
}

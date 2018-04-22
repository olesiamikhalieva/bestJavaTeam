package Pattern.Builder.Car;


public class TestCar {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMark("Mers")
                .buildSpeed(250)
                //.buildTransmission(Transmission.AUTO)
                .build();
        System.out.println(car);
    }
}


enum Transmission {
    MANUAL, AUTO
}

class Car {
    String mark;
    Transmission transmission;
    int speed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}

class CarBuilder {
    String mark = "Default";
    Transmission transmission = Transmission.MANUAL;
    int speed = 120;

    CarBuilder buildMark(String mark) {
        this.mark = mark;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMark(mark);
        car.setSpeed(speed);
        car.setTransmission(transmission);
        return car;
    }
}

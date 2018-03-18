package hw_14_03_18.Task5;

import java.util.Objects;

public class Dog {
    private int speed;

    public Dog(int speed) {
        this.speed = speed;
    }

    public Dog(){

    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return speed == dog.speed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                '}';
    }
}

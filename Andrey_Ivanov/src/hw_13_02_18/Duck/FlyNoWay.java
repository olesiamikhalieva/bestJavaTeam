package hw_13_02_18.Duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}

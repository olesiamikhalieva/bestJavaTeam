package hw8_16_02_18_Patern.PaternStrategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}

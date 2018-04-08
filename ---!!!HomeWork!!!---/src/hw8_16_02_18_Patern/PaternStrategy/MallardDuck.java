package hw8_16_02_18_Patern.PaternStrategy;

public class MallardDuck extends Duck{
    public MallardDuck(){

        quackBehavior = new Quack();
        flyBehavior = new FleWithWings();

    }

    @Override
    public void display() {
        System.out.println("i am real Mallard duck");
    }
}

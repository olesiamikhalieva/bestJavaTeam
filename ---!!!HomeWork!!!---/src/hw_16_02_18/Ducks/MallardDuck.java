package hw_16_02_18.Ducks;

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

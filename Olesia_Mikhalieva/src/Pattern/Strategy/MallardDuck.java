package Pattern.Strategy;

public class MallardDuck extends Pattern.Strategy.Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am really MallardDuck.");
    }
}

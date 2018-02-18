package Pattern.Strategy;


public class Main {
    public static void main(String[] args) {
        Pattern.Strategy.Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Pattern.Strategy.Duck rubberDuck = new Pattern.Strategy.RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

    }
}

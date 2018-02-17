package hw_13_02_18.Duck;

public class TestDucks {

    public static void main(String[] args) {

        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.perfomFly();
        mallard.display();
        System.out.println("--------------");

        Duck model=new ModelDuck();
        model.display();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();

    }
}

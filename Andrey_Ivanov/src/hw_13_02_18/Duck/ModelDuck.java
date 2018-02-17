package hw_13_02_18.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }
}

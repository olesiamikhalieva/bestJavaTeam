package Pattern.Strategy;

import hw_07_02_18.Duck;

public class RubberDuck extends Pattern.Strategy.Duck {

    public RubberDuck() {
        quackBehavior=new Quack();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am rubber duck.");
    }

}

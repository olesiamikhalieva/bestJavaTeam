package hw_07_02_18;

import hw_07_02_18.Interfaces.showAll;

public class RubberDuck extends Birds implements showAll {


    @Override
    public void sound() {
        System.out.print("I am RubberDuck Cva.");
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("____________");
        System.out.print("RunnerDuck: ");
        sound();
    }
}



package hw_07_02_18;

import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.Fly;
import hw_07_02_18.Interfaces.showAll;

public class Duck extends Birds implements Fly, CreateEggs, showAll {

    @Override
    public void fly() {
        System.out.print("I am duck, I can fly.");
    }

    @Override
    public void sound() {
        System.out.print("I am duck. krua.");
    }

    @Override
    public void createEggs() {
        System.out.print("I am duck. I can create eggs.");
    }



    @Override
    public void show() {
        System.out.println();
        System.out.println("____________");
        System.out.print("Duck: ");
        sound();
        System.out.print("+");
        createEggs();
        System.out.print("+");
        fly();
    }
}

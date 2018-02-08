package hw_07_02_18;

import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.showAll;

public class Penguin extends Birds implements CreateEggs, showAll {
    @Override
    public void sound() {
        System.out.print("penguin say gui gui.");
    }


    @Override
    public void createEggs() {
        System.out.print("I am penguin. I can create eggs.");
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("____________");
        System.out.print("Penguin: ");
        sound();
        System.out.print("+");
        createEggs();
    }
}

package hw_07_02_18;

import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.Fly;
import hw_07_02_18.Interfaces.Run;
import hw_07_02_18.Interfaces.showAll;

public class Ostrich extends Birds implements Run, CreateEggs, showAll,Fly {
    @Override
    public void sound() {
        System.out.print("I am camel-bird. ieoe.");
    }

    @Override
    public void run() {
        System.out.print("I am ostrich. I can run like antelope.");
    }

    @Override
    public void createEggs() {
        System.out.print("I am ostrich. I can create eggs.");
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("____________");
        System.out.print("Ostrich: ");
        sound();
        System.out.print("+");
        createEggs();
        System.out.print("+");
        fly();
        System.out.print("+");
        run();
    }

    @Override
    public void fly() {
        System.out.println("I am ostrich. I can fly.");
    }
}

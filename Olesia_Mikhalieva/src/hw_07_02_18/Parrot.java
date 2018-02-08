package hw_07_02_18;

import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.Fly;
import hw_07_02_18.Interfaces.Speak;
import hw_07_02_18.Interfaces.showAll;

public class Parrot extends Birds implements Speak,CreateEggs, showAll, Fly {
    @Override
    public void speak() {
        System.out.print("I am parrot. I can speak like a man.");
    }

    @Override
    public void sound() {
        System.out.print("I am parrot. I can speak.");
    }

    @Override
    public void createEggs() {
        System.out.print("I am parrot. I can create eggs.");
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("____________");
        System.out.print("Parrot: ");
        sound();
        System.out.print("+");
        createEggs();
        System.out.print("+");
        fly();
        System.out.print("+");
         speak();
    }

    @Override
    public void fly() {
        System.out.print("I am parrot. I can fly.");
    }
}

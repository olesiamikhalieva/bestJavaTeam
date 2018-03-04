package hw_04_03_18.hw_07_02_18;

import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;
import hw_04_03_18.hw_07_02_18.Interfaces.Fly;
import hw_04_03_18.hw_07_02_18.Interfaces.Speak;

public class Parrot extends Birds implements Speak, CreateEggs, Fly {
    @Override
    public String speak() {
        return "I am parrot. I can speak like a man.";
    }

    @Override
    public String sound() {
        return "I can speak.";
    }

    @Override
    public String createEggs() {
        return "I can create eggs.";
    }

    @Override
    public String getName() {
        return "parrot";
    }

    @Override
    public void fly() {
        System.out.print("I am parrot. I can fly.");
    }
}

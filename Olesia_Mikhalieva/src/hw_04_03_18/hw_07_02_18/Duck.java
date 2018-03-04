package hw_04_03_18.hw_07_02_18;

import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;
import hw_04_03_18.hw_07_02_18.Interfaces.Fly;

public class Duck extends Birds implements Fly, CreateEggs{

    @Override
    public void fly() {
        System.out.print("I can fly.");
    }

    @Override
    public String sound() {
        return "I have sound: krua.";
    }

    @Override
    public String createEggs() {
        return "I can create eggs.";
    }



    @Override
    public String getName() {
        return "duck";
    }
}

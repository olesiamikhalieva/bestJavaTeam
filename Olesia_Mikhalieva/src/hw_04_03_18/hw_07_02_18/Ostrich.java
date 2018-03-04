package hw_04_03_18.hw_07_02_18;

import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;
import hw_04_03_18.hw_07_02_18.Interfaces.Fly;
import hw_04_03_18.hw_07_02_18.Interfaces.Run;

public class Ostrich extends Birds implements Run, CreateEggs, Fly {
    @Override
    public String sound() {
        return "I have sound: ieoe.";
    }

    @Override
    public String run() {
        return "I can run like antelope.";
    }

    @Override
    public String createEggs() {
        return "I can create eggs.";
    }

    @Override
    public String getName() {
        return "ostrich";
    }

    @Override
    public void fly() {
        System.out.print("I am ostrich. I can fly.");
    }
}

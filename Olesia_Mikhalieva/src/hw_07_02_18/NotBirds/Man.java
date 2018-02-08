package hw_07_02_18.NotBirds;

import hw_07_02_18.Interfaces.Speak;

public class Man implements Speak {
    @Override
    public void speak() {
        System.out.println("I can speak");
    }
}

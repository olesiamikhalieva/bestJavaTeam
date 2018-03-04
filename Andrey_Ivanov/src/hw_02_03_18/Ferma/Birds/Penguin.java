package hw_02_03_18.Ferma.Birds;


import hw_02_03_18.Ferma.Behaviors.CreateEggs;

public class Penguin extends Bird implements CreateEggs {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String createEggs() {
        return "I'm an penguin and I can carry eggs";
    }

    @Override
    public String sound() {
        return "Penguin has a big as";

    }

    @Override
    public String toString() {
        return getName() + " боевой клич=" + sound() + "," + createEggs();
    }
}
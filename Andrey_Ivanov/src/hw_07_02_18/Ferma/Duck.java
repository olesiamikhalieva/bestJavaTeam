package hw_07_02_18.Ferma;

public class Duck extends Bird implements Fly,CreateEggs {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "I am duck,I can fly";

    }

    @Override
    public String sound() {
        return "kryaaa";
    }

    @Override
    public String createEggs() {
        return "I am dug, I like eggs";
    }

    @Override
    public String toString() {
        return getName()+" боевой клич="+sound()+","+createEggs()+","+fly();
    }
}

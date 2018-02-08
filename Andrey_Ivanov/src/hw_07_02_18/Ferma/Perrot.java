package hw_07_02_18.Ferma;

public class Perrot extends Bird implements Speak,CreateEggs,Fly {

    public Perrot(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "I am perrot and Ican fly";
    }

    @Override
    public String createEggs() {
        return "I'm an perrot and I can carry eggs";
    }

    @Override
    public String sound() {
       return "Chik-chirik";

    }

    @Override
    public String speak() {
        return "I can speak like a person";
    }

    @Override
    public String toString() {
        return getName()+" боевой клич="+sound()+","+createEggs()+","+fly()+","+speak();
    }
}

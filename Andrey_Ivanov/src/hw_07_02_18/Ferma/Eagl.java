package hw_07_02_18.Ferma;


public class Eagl extends Bird implements Fly,CreateEggs{

    public Eagl(String name) {
        super(name);
    }

    @Override
    public String createEggs() {
        return "I'm an eagle and I can carry eggs";
    }

    @Override
    public String fly() {
        return "I fly in the sky";
    }

    @Override
    public String sound() {
        return "EEEEEEEEE";
    }

    @Override
    public String toString() {
        return getName()+" боевой клич="+sound()+","+createEggs()+","+fly();
    }
}

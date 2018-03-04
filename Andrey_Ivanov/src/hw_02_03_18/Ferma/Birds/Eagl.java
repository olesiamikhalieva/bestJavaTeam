package hw_02_03_18.Ferma.Birds;


import hw_02_03_18.Ferma.Behaviors.CreateEggs;
import hw_02_03_18.Ferma.Behaviors.Fly;

public class Eagl extends Bird implements Fly,CreateEggs {

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

package hw_02_03_18.Ferma.Birds;

import hw_02_03_18.Ferma.Behaviors.CreateEggs;
import hw_02_03_18.Ferma.Behaviors.Run;

public class Ostrich extends Bird implements Run,CreateEggs {

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public String createEggs() {
        return "I'm an ostrich and I can carry eggs";
    }

    @Override
    public String sound() {
        return "U-u-u";

    }

    @Override
    public String run() {
        return "I'm running like an antelope";
    }

    @Override
    public String toString() {
        return getName()+" боевой клич="+sound()+","+createEggs()+","+run();
    }
}

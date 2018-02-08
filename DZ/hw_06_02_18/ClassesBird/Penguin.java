package ClassesBird;

import Interface.CreateEggs;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Bird implements CreateEggs {
    public Penguin(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("gui-gui");
    }

    @Override
    public void createEggs() {
        System.out.println("Penguin has big eggs");
    }
}

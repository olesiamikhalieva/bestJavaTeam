package les_06_02_18.ClassesBird;

import les_06_02_18.Interface.CreateEggs;
import les_06_02_18.Interface.RunLikeAntelope;

public class Ostrich extends Bird implements RunLikeAntelope, CreateEggs {
    public Ostrich(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("kurlu, kurlu");
    }

    @Override
    public void createEggs() {
        System.out.println("I am Ostrich, and i can create eggs");
    }

    @Override
    public void runLikeAntelope() {
        System.out.println("i am Ostrich, and i run like antelope");
    }

}

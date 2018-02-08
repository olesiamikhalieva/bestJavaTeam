package ClassesBird;

import Interface.CreateEggs;
import Interface.RunLikeAntelope;

public class Ostrich extends Bird implements RunLikeAntelope, CreateEggs {
    public Ostrich(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " kurlu, kurlu ";
    }

    @Override
    public String createEggs() {
        return " I am Ostrich, and i can create eggs ";
    }

    @Override
    public String runLikeAntelope() {
        return " i am Ostrich, and i run like antelope ";
    }

    @Override
    public String toString() {
        return "Bird{ " +
                " Имя птички= ' " + super.getBirdName() + '\'' +
                " Боевой клич= ' " + sound() + '\''+
                 createEggs() + '\''+
                "Я СТРАУС ' " + runLikeAntelope() + '\''+
                '}';
    }
}

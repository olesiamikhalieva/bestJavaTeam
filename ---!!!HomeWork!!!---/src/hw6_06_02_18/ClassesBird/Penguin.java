package hw6_06_02_18.ClassesBird;

import hw6_06_02_18.Interface.CreateEggs;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Bird implements CreateEggs {
    public Penguin(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " gui-gui ";
    }

    @Override
    public String createEggs() {
        return " Penguin has big eggs ";
    }

    @Override
    public String toString() {
        return "Bird{ " +
                " Имя птички= ' " + super.getBirdName() + '\'' +
                " Боевой клич= ' " + sound() + '\''+
                createEggs() + '\'';
    }
}

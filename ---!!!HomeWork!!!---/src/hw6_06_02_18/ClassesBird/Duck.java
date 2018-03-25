package hw6_06_02_18.ClassesBird;

import hw6_06_02_18.Interface.CreateEggs;
import hw6_06_02_18.Interface.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird implements Fly, CreateEggs {
    public Duck(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " krya ";
    }

    @Override
    public String createEggs() {
        return " I am Dug, and i love do eggs ";
    }

    @Override
    public String fly() {
        return " i am Duck, i am fly ";
    }

    @Override
    public String toString() {
        return "Bird{ " +
                " Имя птички= ' " + super.getBirdName() + '\'' +
                " Боевой клич= ' " + sound() + '\''+
                createEggs() + '\''+
                fly() + '\''+
                '}';
    }
}

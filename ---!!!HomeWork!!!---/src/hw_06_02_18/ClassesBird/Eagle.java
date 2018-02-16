package hw_06_02_18.ClassesBird;

import hw_06_02_18.Interface.CreateEggs;
import hw_06_02_18.Interface.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Eagle extends Bird implements Fly, CreateEggs {
    public Eagle(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " EEEEEEEEEEEEE ";
    }

    @Override
    public String createEggs() {
        return " i can create eggs, i am Eagle ";
    }
    @Override
    public String fly() {
        return " I am Eagle, i am fly ";
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

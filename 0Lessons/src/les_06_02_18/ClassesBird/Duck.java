package les_06_02_18.ClassesBird;

import les_06_02_18.Interface.CreateEggs;
import les_06_02_18.Interface.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird implements Fly, CreateEggs {
    public Duck(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void createEggs() {
        System.out.println("I am Dug, and i love do eggs");
    }

    @Override
    public void fly() {
        System.out.println("i am Duck, i am fly");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Имя птички='" + super.getBirdName() + '\'' +
                "Боевой клич='" + super.getBirdName() + '\''+
                '}';
    }
}

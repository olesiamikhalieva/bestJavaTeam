package les_06_02_18.ClassesBird;

import les_06_02_18.Interface.CreateEggs;
import les_06_02_18.Interface.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Eagle extends Bird implements Fly, CreateEggs {
    public Eagle(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("EEEEEEEEEEEEE");
    }

    @Override
    public void createEggs() {
        System.out.println("i can create eggs, i am Eagle");
    }
    @Override
    public void fly() {
        System.out.println("I am Eagle, i am fly");
    }



}

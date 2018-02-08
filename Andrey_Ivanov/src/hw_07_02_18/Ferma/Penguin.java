package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Bird implements CreateEggs {

    @Override
    public void createEggs() {
        System.out.println("Pingvin has a big eggs");
    }

    @Override
    public void sound() {
        System.out.println("Penguin has a big as");

    }
}

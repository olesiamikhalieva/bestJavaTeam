package Interface;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Bird implements CreateEggs {
    @Override
    public void sound() {
        System.out.println("penguin say gui gui");
    }

    @Override
    public void createEggs() {
        System.out.println("penguin has big eggs");
    }
}

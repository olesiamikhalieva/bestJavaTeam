package Interface;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird implements Fly,CreateEggs {
    @Override
    public void fly() {
        System.out.println("i am Duck, i am fly");
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void createEggs() {
        System.out.println("I am dug, and i love do eggs");
    }
}

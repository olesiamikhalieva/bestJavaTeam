package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird implements Fly,CreateEggs {

    @Override
    public void fly() {
        System.out.println("I am duck,I can fly");

    }

    @Override
    public void sound() {
        System.out.println("kryaaa");
    }

    @Override
    public void createEggs() {
        System.out.println("I am dug, I like eggs");
    }
}

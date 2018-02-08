package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Eagl extends Bird implements Fly{

    @Override
    public void fly() {
        System.out.println("I fly in the sky");
    }

    @Override
    public void sound() {
        System.out.println("EEEEEEEEE");
    }
}

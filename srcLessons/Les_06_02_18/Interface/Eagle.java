package Interface;

/**
 * Created by java on 06.02.2018.
 */
public class Eagle extends Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("I am eagle, i am fly");
    }

    @Override
    public void sound() {
        System.out.println("EEEEEEEEEEEEE");
    }

}

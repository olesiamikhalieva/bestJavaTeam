package les_06_02_18.ClassesBird;

/**
 * Created by java on 06.02.2018.
 */
public class RubberDuck extends Bird{

    public RubberDuck(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("quack");
    }

}

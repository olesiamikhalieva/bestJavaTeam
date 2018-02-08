package hw_07_02_18.Ferma;

/**
 * Created by java on 06.02.2018.
 */
public class RubberDuck extends Bird  {


    @Override
    public String sound() {
        return "quack";

    }

    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName()+",I'm just a rubber duck";
    }
}


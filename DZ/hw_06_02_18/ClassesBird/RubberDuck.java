package ClassesBird;

/**
 * Created by java on 06.02.2018.
 */
public class RubberDuck extends Bird {

    public RubberDuck(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " quack ";
    }

    @Override
    public String toString() {
        return "Bird{ " +
                " Имя птички= ' " + super.getBirdName() + '\'' +
                " Боевой клич= ' " + sound() + '\'';
    }
}

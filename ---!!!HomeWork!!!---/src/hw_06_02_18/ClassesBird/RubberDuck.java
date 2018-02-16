package hw_06_02_18.ClassesBird;

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

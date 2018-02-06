package Interface;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();
        Bird rubberDack = new RubberDuck();

//        eagle.sound();
//        duck.sound();

        Bird[] birdMass = {eagle,duck,rubberDack};
        for (Bird b:birdMass) {
            b.sound();
        }

        CreateEggs penguin = new Penguin();
        CreateEggs ducks = new Duck();

        CreateEggs [] mass = new CreateEggs[2];
        mass[0] = penguin;
        mass[1] = ducks;

        for (CreateEggs mas: mass) {
            mas.createEggs();
        }

    }
}

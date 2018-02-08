import ClassesBird.*;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Bird eagle1 = new Eagle();
        Bird eagle2 = new Eagle();
        Bird duck1 = new Duck();
        Bird duck2 = new Duck();
        Bird rubberDuck1 = new RubberDuck();
        Bird rubberDuck2 = new RubberDuck();
        Bird ostrich1 = new Ostrich();
        Bird ostrich2 = new Ostrich();
        Bird parrot1 = new Parrot();
        Bird parrot2 = new Parrot();
        Bird penguin1 = new Penguin();
        Bird penguin2 = new Penguin();

        Bird[] birdMass = {eagle1,eagle2,duck1,duck2,rubberDuck1,rubberDuck2,ostrich1,
                ostrich2,parrot1,parrot2,penguin1,penguin2};

//        Bird[] birdMass = {eagle,duck,rubberDuck};
//        for (Bird b:birdMass) {
//            b.sound();
//        }

//        CreateEggs penguin = new Penguin();
//        CreateEggs ducks = new Duck();
//
//        CreateEggs [] mass = new CreateEggs[2];
//        mass[0] = penguin;
//        mass[1] = ducks;
//
//        for (CreateEggs mas: mass) {
//            mas.createEggs();
//        }
//
    }
}

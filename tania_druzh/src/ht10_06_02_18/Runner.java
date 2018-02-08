package ht10_06_02_18;

import ht10_06_02_18.Birds.*;
import ht10_06_02_18.Int.Fly;
import ht10_06_02_18.Int.RunLikeAnAntelope;
import ht10_06_02_18.Int.SpeakLikeAMan;

public class Runner {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();
        Bird rubberDuck = new RubberDuck();
        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Bird [] birds = new Bird[5];
        birds[0] = eagle;
        birds[1] = duck;
        birds[2] = rubberDuck;
        birds[3] = parrot;
        birds[4] = ostrich;

        for (Bird bird : birds) {
            System.out.print(bird.getClass().getSimpleName() + " ");
            bird.sound();
            if (bird instanceof Fly) {((Fly) bird).fly();}
            if (bird instanceof SpeakLikeAMan) {((SpeakLikeAMan) bird).speak();}
            if (bird instanceof RunLikeAnAntelope) {((RunLikeAnAntelope) bird).run();}
            System.out.println();
        }

    }
}

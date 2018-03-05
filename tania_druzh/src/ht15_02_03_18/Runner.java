package ht15_02_03_18;

import ht15_02_03_18.Birds.*;
import ht15_02_03_18.Int.RunLikeAnAntelope;
import ht15_02_03_18.Int.Fly;
import ht15_02_03_18.Int.SpeakLikeAMan;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Duck duck = new Duck();
        RubberDuck rubberDuck = new RubberDuck();
        Parrot parrot = new Parrot();
        Ostrich ostrich = new Ostrich();

        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(eagle);
        birds.add(duck);
        birds.add(rubberDuck);
        birds.add(parrot);
        birds.add(ostrich);

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

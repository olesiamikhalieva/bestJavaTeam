package hw_14_03_18;

import java.util.concurrent.ThreadLocalRandom;

public class random {

    public Integer[] randomIntegerMass(int min, int max, int length) {
        Integer[] mass = new Integer[length];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new Integer(ThreadLocalRandom.current().nextInt(min, max));
        }
        return mass;

    }
}

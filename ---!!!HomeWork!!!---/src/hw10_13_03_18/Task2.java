package hw10_13_03_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = -25 + random.nextInt(50 + 25 + 1);
            integers.add(num);
        }

        ArrayList<Integer> integers1 = new ArrayList<>();
        integers.add(8);
        integers.add(-12);
        integers.add(0);
        integers.add(22);
        integers.add(5);

        System.out.println("max: " + Collections.min(integers));
        System.out.println("min: " + Collections.max(integers));

        System.out.println(integers.containsAll(integers1));

    }
}

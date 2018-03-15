package hw_14_03_18;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int max = -25;
        int min = 50;
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = -25 + random.nextInt(50 + 25 + 1);
            integers.add(num);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        for (Integer i:integers) {
            boolean eight = false;
        }

    }
}

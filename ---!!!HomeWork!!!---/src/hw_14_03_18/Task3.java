package hw_14_03_18;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int num = 8 + random.nextInt(17);
            integers.add(num);
        }

        integers.forEach(s-> System.out.print(" " + s));
        System.out.println("");
        ArrayList<Integer> integers1 = new ArrayList<>(integers.subList(5,12));
        integers1.forEach(s-> System.out.print(" " + s));

    }
}

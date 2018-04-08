package hw10_13_03_18;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            Random random = new Random();
            int num = 25 + random.nextInt(75);
            integers.add(num);
        }
        System.out.println(integers);
        integers.subList(14,42).clear();
        System.out.println(integers);
    }
}

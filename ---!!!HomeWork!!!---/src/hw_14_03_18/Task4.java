package hw_14_03_18;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <120 ; i++) {
            Random random = new Random();
            int num = 25 + random.nextInt(75);
            integers.add(num);
        }


    }
}

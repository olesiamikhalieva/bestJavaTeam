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


    }
}

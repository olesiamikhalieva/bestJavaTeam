package hw_14_03_18;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(new random().randomIntegerMass(25, 99, 80)));
        list.forEach(num -> System.out.print(num + ", "));
        System.out.println();

        for (int i = 15; i < 44; i++) {
            list.remove(i);
        }

        list.forEach(num -> System.out.print(num + ", "));
    }
}


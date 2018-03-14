package hw_14_03_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new random().randomIntegerMass(8, 24,20)));
        list1.forEach(num -> System.out.print(num + ", "));
        System.out.println();
        List<Integer> list2 = new ArrayList<>(list1.subList(8, 12));
        list2.forEach(num -> System.out.print(num + ", "));

    }
}

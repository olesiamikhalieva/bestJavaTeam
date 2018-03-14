package hw_14_03_18;

import hw_26_01_18.Polynom.Array;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new random().randomIntegerMass(-25,75,20)));
        list.forEach(number -> System.out.print(number+", "));
        System.out.println();
        System.out.println("Min number - "+Collections.min(list));
        System.out.println("Max number - "+Collections.max(list));
        System.out.println("list contains 9: "+ list.contains(9));
        System.out.println("list contains -25: "+ list.contains(-25));
    }
}

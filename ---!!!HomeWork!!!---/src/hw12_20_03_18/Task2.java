package hw12_20_03_18;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        String str = new String("1, 2, 3, 4, 4, 5,33,33,8,8,89,0б");

        String[] stringMass = str.split(",");
        for (int i = 0; i < stringMass.length; i++) {
            stringMass[i] = stringMass[i].trim();
        }
        HashSet<String> stringHashSet = new HashSet<>(Arrays.asList(stringMass));
        stringHashSet.forEach(s -> System.out.println(s));
    }
}

package hw_20_03_18;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Task2 {
    public static void main(String[] args) {
        String s = new String("1, 2, 3, 4, 4, 5,33,33,8,8,89,0б");

        String[] stringMass = s.split(",");
        for (int i = 0; i < stringMass.length; i++) {
            stringMass[i] = stringMass[i].trim();
        }


    }
}

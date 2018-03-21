package hw_20_03_18;

import java.util.Arrays;
import java.util.HashSet;

public class Task_2 {
    public static void main(String[] args) {
        String text = "1,2,3,4,4,5,33,33,8,8,89,0";
        String[] mass = text.split(",");
        HashSet<String> set = new HashSet<String>(Arrays.asList(mass));
        set.forEach(s -> System.out.print(s + ", "));
    }
}

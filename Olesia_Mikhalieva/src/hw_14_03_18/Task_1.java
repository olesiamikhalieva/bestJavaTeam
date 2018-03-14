package hw_14_03_18;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Ann");
        namesList.add("Viktor");
        namesList.add("Ignat");
        namesList.add("Valentin");
        namesList.add("Igor");
        namesList.add("Olya");
        namesList.add("Sveta");
        namesList.add("Tanya");
        namesList.add("Viktor");
        namesList.add("Ignat");
        namesList.add("Inokentiy");
        namesList.add("Tit");
        namesList.add("Jary");
        namesList.add("Osvald");
        namesList.add("Fernando");


        Set<String> namesHashSet = new HashSet<>(namesList);
        namesHashSet.forEach(name -> System.out.print(name+",\t"));
        System.out.println();
        namesList.forEach(name -> System.out.print(name+",\t"));

    }
}

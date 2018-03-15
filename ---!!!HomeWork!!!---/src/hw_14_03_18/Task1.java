package hw_14_03_18;

import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Аня");
        strings1.add("Виктор");
        strings1.add("Игнат");
        strings1.add("Валентин");
        strings1.add("Игорь");
        strings1.add("Оля");
        strings1.add("Света");
        strings1.add("Таня");

        strings1.forEach(s -> System.out.println(s));
        System.out.println("-------------------");

        Set<String> strings2 = new HashSet<>(strings1);
        strings2.forEach(s -> System.out.println(s));
        System.out.println("-------------------");

        ArrayList<String> strings3 = new ArrayList<>();
        strings3.add("Виктор");
        strings3.add("Игнат");
        strings3.add("Иннакентий");
        strings3.add("Тит");
        strings3.add("Ждери");
        strings3.add("Освальд");
        strings3.add("Фернандо");

        strings1.addAll(strings3);
        strings1.forEach(s -> System.out.println(s));
        System.out.println("-------------------");

        strings2.addAll(strings3);
        strings2.forEach(s -> System.out.println(s));
        System.out.println("-------------------");
    }
}

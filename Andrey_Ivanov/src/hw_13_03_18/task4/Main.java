package hw_13_03_18.task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    /*Создать список, который заполнен числами от 25 до 99.
     Удалить часть данных из середины списка. С (15 по 43 элемент)
      */

    public static void main(String[] args) {

        List<Integer> mass = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            mass.add(ThreadLocalRandom.current().nextInt(25, 99 + 1));

        }

        System.out.println("Вывод всей коллекции:\n"+mass);

        mass.subList(15,43).clear();

        System.out.println("Вывод коллекции после удаления части элементов:\n"+mass);

    }
}

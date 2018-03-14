package hw_13_03_18.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    /*Создать список, который заполнить числами от 8 до 24.
    Далее создать второй список, который заполнить числами из
    первой коллекции, которые находятся с 5 по 12 позиции.
    Вывести обе коллекции на экран.
     */

    public static void main(String[] args) {

        List<Integer> mass1=new ArrayList<>();

        for (int i=0;i<20;i++){
            mass1.add(ThreadLocalRandom.current().nextInt(8,24+1));
        }

        System.out.println(mass1);

        List<Integer>mass2=new ArrayList<>(mass1.subList(4,11));

        System.out.println(mass2);

    }
}

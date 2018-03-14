package hw_13_03_18.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

public class Main {
   /* Создать коллекцию, которая заполнена случайными числами от -25 до 50,
   вывести минимальное и максимальное значение.есть числа 8, -12, 0, 22,5.
   Проверить содержит ли наша коллекция данные числа после заполнения.Если да -выводим правду, в противном случае лож.*/

    public static void main(String[] args) {

        ArrayList<Integer> randomNumber = new ArrayList<>(30);

        ArrayList<Integer>myNumb=new ArrayList<Integer>(asList(8,-12,0,22,5));
        System.out.println(myNumb);

        for (int i = 0; i < 30; i++) {
            randomNumber.add(ThreadLocalRandom.current().nextInt(-25, 50 + 1));
        }
        System.out.println("Вывод коллекции:\n" + randomNumber);

        System.out.println("Max=" + Collections.max(randomNumber));
        System.out.println("Min=" + Collections.min(randomNumber));

        System.out.println(randomNumber.containsAll(myNumb));


    }
}



package hw_20_03_18;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        task4();


    }


    /*1.Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
      Вывести содержимое коллекции на экран, каждый элемент с новой строки.
      Пример вывода (тут показана только одна строка): Sim - 5*/
    public static void task1() {

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Slim", 5);
        hashMap.put("Bob", 7);
        hashMap.put("Sos", 10);
        hashMap.put("Kot", 9);
        for (HashMap.Entry<String, Object> s : hashMap.entrySet()) {
            System.out.println(s.getKey() + "-" + s.getValue());
        }
    }

    /* 2.Пользователь вводит набор  произвольных чисел
       в виде одной строки (“1, 2, 3, 4, 4, 5,33,33,8,8,89,0б”).
       Избавиться от повторяющихся элементов в строке и вывести результат на экран */
    public static void task2() {

        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            hashSet.add(n);
            arrayList.add(n);
        }
        System.out.println("Введенные числа: " + arrayList);
        System.out.println("Избавился от повторений: " + hashSet);
    }

    /*3.Есть карта Map<String, String> map = new HashMap<>();
      map.put("C", "c"); проверить есть ли в ней ключ "Е",
      если нет такого вывести "нет такого"*/
    public static void task3() {

        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("E", "c");
        if (map.containsKey("E")) {
            System.out.println("Eсть такой ключ");
        } else {
            System.out.println("Нет такого ключа");
        }
    }

    /*4.Есть карта Map<String, String> map = new HashMap<>();
      map.put("C", "c");
      map.put("B", "b");
      положить туда пару "B", "bob" если такого ключа нет.*/

    public static void task4() {

        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("D", "b");
        if (map.containsKey("B")) {
            System.out.println("Такой ключ уже есть!");
        } else {
            map.put("B", "bob");
            System.out.println("Положили в коллекцию пару B-bob ");
        }
        System.out.println(map);
    }
}




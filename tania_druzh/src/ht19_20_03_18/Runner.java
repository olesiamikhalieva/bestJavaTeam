package ht19_20_03_18;

import ht19_20_03_18.Birds.Duck;
import ht19_20_03_18.Birds.Parrot;
import ht19_20_03_18.Birds.RubberDuck;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
        t4();
    }

    /*Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5*/
    public static void t1(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Sim",(Integer) 15);
        hashMap.put("Nim",(Float) 15f);
        hashMap.put("Rim",(Double) 15d);
        hashMap.put("Dim",new Duck("Ducky"));
        hashMap.put("Kim",new Duck("Dicky"));
        hashMap.put("Pim",new RubberDuck("Rubby"));
        hashMap.put("Lim",new RubberDuck("Rabbit"));
        hashMap.put("Bim",(String) "15");
        hashMap.put("Mim",new Parrot("Pary"));
        hashMap.put("Tim",new Parrot("Poly"));

        Set<String> keys = hashMap.keySet();

        Iterator<String> itr = keys.iterator();

        String str;

        while (itr.hasNext()) {

            str = itr.next();

            System.out.println(str+" - "+hashMap.get(str));
        }
    }

    /*Пользователь вводит набор  произвольных чисел в виде одной строки (“1, 2, 3, 4, 4, 5,33,33,8,8,89,0б”).
Избавиться от повторяющихся элементов в строке и вывести результат на экран.*/
    public static void t2(){
        String str = "1,2,3,4,4,5,33,33,8,8,89,96";
        String[] numbs = str.split(",");
        Set<String> integerSet = new TreeSet<>();
        for (String s : numbs) {
            integerSet.add(s);
        }
        String newString = "";
        Iterator it = integerSet.iterator();
        while (it.hasNext()){
            newString += it.next() + ", ";
        }
        System.out.println(newString);
    }

    /*Есть карта
  Map<String, String> map = new HashMap<>();
   map.put("C", "c");
проверить есть ли в ней ключ "Е", если нет такого вывести "нет такого"*/
    public static void t3(){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");

        Set<String> keys = map.keySet();
        if (! keys.contains("E")) System.out.println("нет такого");
    }

    /*есть карта
Map<String, String> map = new HashMap<>();
   map.put("C", "c");
   map.put("B", "b");
положить туда пару "B", "bob" если такого ключа нет.*/
    public static void t4(){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");

        map.putIfAbsent("B", "bob" );

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}

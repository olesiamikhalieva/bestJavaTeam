package ht16_13_03_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
        t4();

    }

    private static void t1(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Аня");
        names.add("Виктор");
        names.add("Игнат");
        names.add("Валентин");
        names.add("Игорь");
        names.add("Оля");
        names.add("Света");
        names.add("Таня");

        HashSet<String> namesSet = new HashSet<>();
        for (String name : names) {
            namesSet.add(name);
        }

        names.add("Виктор");
        names.add("Игнат");
        names.add("Иннокентий");
        names.add("Тит");
        names.add("Ждери");
        names.add("Освальд");
        names.add("Фернандо");

        for (String name : names) {
            namesSet.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.size());
        System.out.println("---------------------");
        for (String s : namesSet) {
            System.out.println(s);
        }
        System.out.println(namesSet.size());

    }

    private static void t2(){
        ArrayList<Integer> numb = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            numb.add((int) (-25 + Math.random()*75));
        }

        for (Integer integer : numb) {
            System.out.println(integer);

        }

        System.out.println("max = " + Collections.max(numb));
        System.out.println("min = " + Collections.min(numb));
        System.out.println("contains 8 " + numb.contains(8));
        System.out.println("contains -12 " + numb.contains(-12));
        System.out.println("contains 0 " + numb.contains(0));
        System.out.println("contains 22 " + numb.contains(22));
        System.out.println("contains 5 " + numb.contains(5));



    }

    private static void t3(){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list1.add((int) (8 + Math.random()*16));
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for( int i = 8; i < 13; i++){
            list2.add(list1.get(i));
        }

        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("-----------------");
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }

    private static void t4(){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            list1.add((int) (25 + Math.random()*74));
        }

        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

        for( int i = 43; i >= 15; i--){
            list1.remove(i);
        }

        System.out.println();
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

    }
}

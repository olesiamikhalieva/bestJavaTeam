package ht17_13_03_18;

import ht17_13_03_18.Birds.Bird;
import ht17_13_03_18.Birds.Duck;
import ht17_13_03_18.Birds.Ostrich;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
        t4();
        t5();

    }

    /*Создать структуру данных которая содержит в себе имена : Аня. Виктор, Игнат, Валентин,Игорь, Оля, Света, Таня.
   Создать еще одну структуру данных, но которая будет содержать только уникальные значения, заполнить ее полями предыдущей структуры.
   -Добавить в обе структуры данных имена:  Виктор, Игнат, Иннакентий, Тит, Ждери, Освальд, Фернандо, после вывести их содержание.*/
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

        HashSet<String> namesSet = new HashSet<>(names);

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

    /*Cоздать коллекцию, которая заполнена случайными числами от -25 до 50, вывести минимальное и максимальное значение.
  - есть числа 8, -12, 0, 22,5. Проверить содержит ли наша коллекция данные числа после заполнения.
  Если да -выводим правду, в противном случае лож.*/
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

    /*Создать список, который заполнить числами от 8 до 24.
Далее создать второй список, который заполнить числами из первой коллекции, которые находятся с 5 по 12 позиции.
Вывести обе коллекции на экран.*/
    private static void t3(){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list1.add((int) (8 + Math.random()*16));
        }

        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(8,13));

        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("-----------------");
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }

    /*Создать список, который заполнен числами от 25 до 99. Удалить часть данных из середины списка. С (15 по 43 элемент)*/
    private static void t4(){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            list1.add((int) (25 + Math.random()*74));
        }

        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

        list1.subList(15,43).clear();

        System.out.println();
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

    }

    /*Найти способ как сортировать объекты(объект на базе собственного класса) в коллекциях TreeSet, HashSet, ArrayList, LinkedList/.
Написать по одному примеру для каждой коллекции.*/
    private static void t5(){
        TreeSet<Bird> birdTreeSet = new TreeSet<>();
        birdTreeSet.add(new Ostrich("Vasia"));
        birdTreeSet.add(new Ostrich("Ignat"));
        birdTreeSet.add(new Duck("Duckie"));
        birdTreeSet.add(new Duck("Trik"));

        for (Bird bird : birdTreeSet) {
            System.out.println(bird.getName());
        }

        System.out.println("------------------");

        HashSet<Bird> birdHashSet = new HashSet<>();
        birdHashSet.add(new Ostrich("Vasia"));
        birdHashSet.add(new Ostrich("Ignat"));
        birdHashSet.add(new Duck("Duckie"));
        birdHashSet.add(new Duck("Trik"));



        for (Bird bird : birdHashSet) {
            System.out.println(bird.getName() +" " + bird.hashCode());
        }

        System.out.println("------------------");

        ArrayList<Bird> birdArrayList = new ArrayList<>();
        birdArrayList.add(new Ostrich("Vasia"));
        birdArrayList.add(new Ostrich("Ignat"));
        birdArrayList.add(new Duck("Duckie"));
        birdArrayList.add(new Duck("Trik"));

        Collections.sort(birdArrayList);
        for (Bird bird : birdArrayList) {
            System.out.println(bird.getName());
        }

        LinkedList<Bird> birdLinkedList = new LinkedList<>();
        birdLinkedList.add(new Ostrich("Vasia"));
        birdLinkedList.add(new Ostrich("Ignat"));
        birdLinkedList.add(new Duck("Duckie"));
        birdLinkedList.add(new Duck("Trik"));
        System.out.println("------------------");
        Collections.sort(birdLinkedList);
        for (Bird bird : birdLinkedList) {
            System.out.println(bird.getName());
        }
    }
}

package ht17_13_03_18;

import ht17_13_03_18.MySuperClasses.MySuperArrayList;

import java.util.LinkedList;

public class MyClassesRunner {
    public static void main(String[] args) {
        MySuperArrayList<Integer> my = new MySuperArrayList<>();
        my.add(5);
        my.add(7);
        my.add(3);
        my.add(4);
        my.add(8);
        System.out.println(my.toString());
        System.out.println(my.get(1));
        my.remove(2);
        System.out.println(my.toString());
        System.out.println(my.size());
        System.out.println(my.contains(1));

        
    }
}

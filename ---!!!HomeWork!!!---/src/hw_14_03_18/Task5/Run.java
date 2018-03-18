package hw_14_03_18.Task5;

import Test.Collection;

import java.util.*;

public class Run {
    public static void main(String[] args) {

/////////////////////////////////////////////////////
        Cat cat = new Cat("vjux", 9);
        Cat cat1 = new Cat("pux", 8);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat1);

        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);
        System.out.println("---------------");
//////////////////////////////////////////////////////
        LinkedList<Cat> catLinkedList = new LinkedList<>();

        catLinkedList.add(cat);
        catLinkedList.add(cat1);

        System.out.println(catLinkedList);

        Collections.sort(catLinkedList);

        System.out.println(catLinkedList);
        System.out.println("---------------");
//////////////////////////////////////////////////////
        TreeSet<Cat> catTreeSet = new TreeSet<>();

        catTreeSet.add(cat);
        catTreeSet.add(cat1);

        System.out.println(catTreeSet);
        System.out.println("---------------");
//////////////////////////////////////////////////////

        HashSet<Cat> catHashSet = new HashSet<>();

        catHashSet.add(cat);
        catHashSet.add(cat1);

        System.out.println(catHashSet);

        ArrayList<Cat> catArrayList = new ArrayList<>(catHashSet);
        Collections.sort(catArrayList);

        System.out.println(catArrayList);
        System.out.println("---------------");
//////////////////////////////////////////////////////////
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog(45));
        dogs.add(new Dog(55));
        System.out.println(dogs);

        Collections.sort(dogs, new SpeedDogComparator());

        System.out.println(dogs);
////////////////////////////////////////////////////////
        ArrayList<Dog> dogs1 = new ArrayList<>();

        dogs1.add(new Dog(45));
        dogs1.add(new Dog(55));
        System.out.println(dogs1);

        Collections.sort(dogs1, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        System.out.println("по возрастанию" + dogs1);
        Collections.sort(dogs1, new Comparator<Dog>(){
            @Override
            public int compare(Dog o1, Dog o2){
                return o2.getSpeed()-o1.getSpeed();
            }
        });

        System.out.println("по убыванию" + dogs1);

/////////////////////////////////////////////////////////
    }
}
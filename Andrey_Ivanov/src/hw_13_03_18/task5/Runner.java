package hw_13_03_18.task5;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<Person>persons=new ArrayList<>();
        persons.add(new Person("Kolya",25));
        persons.add(new Person("Wima",34));
        persons.add(new Person("Vova",56));
        persons.add(new Person("Anton",70));

        //сортировка по возрасту ArrayList
        Collections.sort(persons,new AgeComparator());
        System.out.println("Сортировка ArrayList:\n"+"По возрасту->"+persons);

        //сортировка по имени ArrayList
        Collections.sort(persons,new NameComparator());
        System.out.println("По имени->"+persons);

        System.out.println("-------------------------------------");

        List<Person>persons1=new LinkedList<>();
        persons1.add(new Person("Kolya",25));
        persons1.add(new Person("Wima",34));
        persons1.add(new Person("Vova",56));
        persons1.add(new Person("Anton",70));

        //сортировка по возрасту LinkedList
        Collections.sort(persons1,new AgeComparator());
        System.out.println("Сортировка LinkedList:\n"+"По возрасту->"+persons1);

        //сортировка по имени LinkedList
        Collections.sort(persons1,new NameComparator());
        System.out.println("По имени->"+persons1);

        System.out.println("-------------------------------------");

        //Сортировка по имени TreeSet
        Set<Person> persons2=new TreeSet<>(new NameComparator());
        persons2.add(new Person("Vova",56));
        persons2.add(new Person("Wima",34));
        persons2.add(new Person("Kolya",25));
        persons2.add(new Person("Anton",70));
        System.out.println("Сортировка TreeSet:\n"+"По имени->"+persons2);

        //сортировка по возрасту TreeSet
        Set<Person> persons3=new TreeSet<>(new AgeComparator());
        persons3.add(new Person("Vova",56));
        persons3.add(new Person("Wima",34));
        persons3.add(new Person("Kolya",25));
        persons3.add(new Person("Anton",70));
        System.out.println("По возрасту->"+persons3);

        System.out.println("-------------------------------------");

        //Сортировка по имени HashSet

        Set<Person> persons4=new HashSet<>();
        persons4.add(new Person("Vova",56));
        persons4.add(new Person("Wima",34));
        persons4.add(new Person("Kolya",25));
        persons4.add(new Person("Anton",70));
        List<Person>persons5=new ArrayList<>(persons4);
        Collections.sort(persons5,new NameComparator());
        System.out.println("Сортировка HashSet:\n"+"По имени->"+persons5);

        //сортировка по возрасту HashSet

        Set<Person> persons6=new HashSet<>();
        persons6.add(new Person("Vova",56));
        persons6.add(new Person("Wima",34));
        persons6.add(new Person("Kolya",25));
        persons6.add(new Person("Anton",70));
        List<Person>persons7=new ArrayList<>(persons6);
        Collections.sort(persons7,new AgeComparator());
        System.out.println("По возрасту->"+persons7);

        System.out.println("-------------------------------------");
    }
}

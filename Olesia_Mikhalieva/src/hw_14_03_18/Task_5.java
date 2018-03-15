package hw_14_03_18;


import java.util.*;

public class Task_5 {
    public static void main(String[] args) {

        System.out.println("TreeSet:");
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        treeSet.add(67);
        treeSet.add(65);
        treeSet.add(6);
        treeSet.forEach(n -> System.out.print(n+", "));


        System.out.println();
        System.out.println("Set:");
        Set<Integer> hashSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        hashSet.add(67);
        hashSet.add(69);
        hashSet.add(6);
        hashSet.forEach(n -> System.out.print(n+", "));


        System.out.println();
        System.out.println("ArrayList:");
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Vasya");
        arrayList.add("Ann");
        arrayList.add("Jone");
       // arrayList.forEach(n -> System.out.print(n+", "));
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        arrayList.forEach(n -> System.out.print(n+", "));

        System.out.println();
        System.out.println("LinkedList:");
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.add(67);
        linkedList.add(69);
        linkedList.add(6);
        //linkedList.forEach(n -> System.out.print(n+", "));
        Collections.sort(linkedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        linkedList.forEach(n -> System.out.print(n+", "));

    }
}

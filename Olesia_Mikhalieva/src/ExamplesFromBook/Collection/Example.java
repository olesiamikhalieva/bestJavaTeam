package ExamplesFromBook.Collection;


import java.util.*;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        String[]stringMass = new String[]{"Summer", "Winter", "Spring"};

        System.out.println("TreeSet:");
        ArrayList<String>arrayListString = new ArrayList();
        arrayListString.add("Array");
        TreeSet<String>stringTreeSet1 = new TreeSet<String>(Arrays.asList(stringMass));
        stringTreeSet1.add("Autumn");
        stringTreeSet1.addAll(arrayListString);
       //
        Iterator<String> iterator = stringTreeSet1.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals("Array")){
                iterator.remove();
            }
        }

        stringTreeSet1.forEach(s -> System.out.println(s));

        System.out.println("_______________");
        TreeSet<String>stringTreeSet2 = new TreeSet<>();
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
        System.out.println();
        HashSet<String> set = new HashSet<>();
        set.add("leto");
        set.add("spring");
        set.add("winter");
        set.add("summer");
        set.forEach(s -> System.out.println(s));

    }
}

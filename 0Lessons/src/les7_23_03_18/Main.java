package les7_23_03_18;

import java.util.*;

/**
 * Created by java on 23.03.2018.
 */
public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> stringMapChet = new HashMap<>();
//        Map<Integer, String> stringMapNoChet = new HashMap<>();
//
////        stringMap.put("K", "k");
////        System.out.println(stringMap.containsKey("K"));
////        System.out.println(stringMap.containsKey("K")? "ok": "net takogo, rabotaem plotno c Idea");
////        System.out.println(stringMap.getOrDefault("B", stringMap.get("K")));
//
//        String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
//        String[] strMass = s.split(" ");
//
//        for (int i = 0; i < strMass.length; i++) {
//            if ((i + 1) % 2 == 0) {
//                stringMapNoChet.put(i + 1, strMass[i]);
//            } else {
//                stringMapChet.put(i + 1, strMass[i]);
//            }
//        }
//        System.out.println("не четная");
//        stringMapChet.forEach((K, V) -> System.out.println(K + " - " + V));
//
//        System.out.println("четная");
//        stringMapNoChet.forEach((K, V) -> System.out.println(K + " - " + V));
//        ////////////////////////////////////////////////////////////////////////////////
//        HashMap<Integer, String> stringHashMapChet = new HashMap<>();
//        HashMap<Integer, String> stringHashMapNoChet = new HashMap<>();
//
//        for (int i = 0; i < strMass.length; i++) {
//            stringMapNoChet.put(i + 1, strMass[i]);
//        }
//
//        for (Map.Entry<Integer, String> entry : stringHashMapChet.entrySet()){
//            if (entry.getKey() % 2 == 0) {
//                stringHashMapChet.put(entry.getKey(), entry.getValue());
//            } else {
//                stringHashMapNoChet.put(entry.getKey(), entry.getValue());
//            }
//        }

















        String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] strings = s.split(" ");
        Queue<Literal> litQ = new ArrayDeque<>();
        ArrayList<Literal> litQNoChet = new ArrayList<>();

        for (int i = 1; i < strings.length; i++) {
            Literal literal = new Literal(i, strings[i]);
            litQ.add(literal);
        }

        for (Literal l : litQ) {
            if (l.getNumber() % 2 == 1) {
                litQNoChet.add(litQ.poll());
            }

        }
        System.out.println("chet " );
        litQ.forEach(q -> System.out.println( q.getLit()));

        System.out.println("noChet ");
        litQNoChet.forEach(q -> System.out.println( q.getLit()));


    }
}


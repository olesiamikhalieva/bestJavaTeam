package hw12_20_03_18;

import les_06_03_18.Employer;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("one", new Employer("Igor", 55));
        hashMap.put("two", new Employer("Vadim", 38));
        hashMap.put("three", new Employer("Ignat", 26));
        hashMap.put("four", new Employer("Arkadij", 23));
        hashMap.put("five", new Employer("Gena", 19));
        hashMap.put("six", new Employer("Vanya", 45));
        hashMap.put("seven", new Employer("Serg", 18));
        hashMap.put("eight", new Employer("Eugene", 16));
        hashMap.put("nine", new Employer("Anton", 35));
        hashMap.put("ten", new Employer("Vasia", 47));

        for (Map.Entry<String, Object> mEntr : hashMap.entrySet()) {
            System.out.println(mEntr.getKey() + " - " + mEntr.getValue());
        }

        //hashMap.forEach((K,V)-> System.out.println(K +" - " + V));

//        Set<String> strings = hashMap.keySet();
//        strings.forEach(s-> System.out.println(s));
//
//        Collection<Object> objects = hashMap.values();
//        objects.forEach(s-> System.out.println(s));


    }
}

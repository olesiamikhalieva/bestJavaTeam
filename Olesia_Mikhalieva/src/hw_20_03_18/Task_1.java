package hw_20_03_18;

import java.util.HashMap;

public class Task_1 {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("Sim", 5);
        hashMap.put("Jone", 45);
        hashMap.put("Ivan", 5);
        hashMap.put("Olya", 2);
        hashMap.put("Dima", 120);
        hashMap.put("Vasya", 5);
        hashMap.put("Tim", 31);
        hashMap.put("Lena", 51);
        hashMap.put("Artem", 24);
        hashMap.put("Semen", 18);
        hashMap.forEach((s, o) -> System.out.println(s+" "+o));

    }
}

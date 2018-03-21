package hw_20_03_18;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
       // map.put("E", "e");
        String key = "E";
        if (map.get(key) == null) {
            System.out.println("нет такого");
        }
    }
}

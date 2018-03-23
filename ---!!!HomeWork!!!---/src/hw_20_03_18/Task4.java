package hw_20_03_18;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");

        map.putIfAbsent("B","b");

    }
}

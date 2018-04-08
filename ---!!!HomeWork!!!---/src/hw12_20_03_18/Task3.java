package hw12_20_03_18;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");

        if (map.containsKey("C")){
            System.out.println("Есть такой");
        }else {
            System.out.println("Нет токого");
        }
    }
}

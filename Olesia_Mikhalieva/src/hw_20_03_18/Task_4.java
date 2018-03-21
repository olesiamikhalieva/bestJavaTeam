package hw_20_03_18;

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<>();
        map.put("C","c");
        map.put("B","b");
        int i =0;
        for(Map.Entry<String,String> key: map.entrySet()){
            if (key.getKey()=="B"){
                i++;
            }
            if (i==0){
                map.put("B","bob");
            }
        }

     //   map.forEach((s, s2) -> System.out.println(s+" "+s2));

    }
}

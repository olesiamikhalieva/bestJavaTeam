package ExamplesFromBook.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteMapElements {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        Map<String, String> maps = new HashMap<>();
        Map<String, String> map = new HashMap<>();

        Map[] mapArray = {map, mapa, maps};

        map.put("Кеша", "Желтков");
        map.put("Вася", "Пупкин");
        map.put("Ксюша", "Плюшева");
        maps.put("Кеша", "Желтков");
        maps.put("Вася", "Пепкин");
        maps.put("Ксюша", "Плюшева");
        mapa.put("Кеша", "Жултков");
        mapa.put("Вася", "Пупкин");
        mapa.put("Ксюша", "Плюшева");
        String delete = "Плюшева";
        System.out.print(map + "\n" + mapa + "\n" + maps + "\n");

        for (Map mapDel : mapArray) {
            for (Iterator<Map.Entry<String, String>> it = mapDel.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<String, String> entry = it.next();
                if (entry.getValue().equals(delete)) {
                    it.remove();
                }
            }
        }
        System.out.print(map + "\n" + mapa + "\n" + maps + "\n");
    }
}


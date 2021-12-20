package exercises.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<String, String> maps = new HashMap<>();
        maps.put("1", "One");
        maps.put("2", "Two");
        System.out.println("Before: " + maps);

        for (Map.Entry<String, String> entry : maps.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            maps.remove(key, value);
            maps.put(value, key);
        }
        System.out.println("After: " + maps);
    }
}

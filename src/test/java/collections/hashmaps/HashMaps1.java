package collections.hashmaps;

import java.util.HashMap;

public class HashMaps1 {

    public static void main(String[] args) {

        System.out.println("1. Write a Java program to associate the specified value with the specified key in a HashMap.");
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Brian");
        names.put(3,"Mark");
        names.put(2,"Donald");
        names.put(5,"Anthony");
        names.put(4,"Brandon");
        System.out.println(names);

        System.out.println("2. Write a Java program to count the number of key-value (size) mappings in a map.");
        System.out.println(names.size());

        System.out.println("3. Write a Java program to copy all of the mappings from the specified map to another map.");
        HashMap<Integer,String> mapToClone = new HashMap<>();
        mapToClone = (HashMap<Integer, String>) names.clone();
        System.out.println(mapToClone);

        System.out.println("4. Write a Java program to remove all of the mappings from a map.");
        mapToClone.clear();
        System.out.println(mapToClone);

        System.out.println("5. Write a Java program to check whether a map contains key-value mappings (empty) or not. ");
        System.out.println(names.isEmpty());

        System.out.println("6. Write a Java program to get a shallow copy of a HashMap instance ");
        names.putAll(mapToClone);

        System.out.println("7. Write a Java program to test if a map contains a mapping for the specified key.");
        System.out.println(names.containsKey(1));

        System.out.println("8. Write a Java program to test if a map contains a mapping for the specified value.");
        System.out.println(names.containsValue("Brian"));

        System.out.println("9. Write a Java program to create a set view of the mappings contained in a map.");
        System.out.println(names.entrySet());

        System.out.println("10. Write a Java program to get the value of a specified key in a map.");
        System.out.println(names.containsKey(1));

        System.out.println("11. Write a Java program to get a set view of the keys contained in this map. ");
        System.out.println(names.keySet());

        System.out.println("12. Write a Java program to get a collection view of the values contained in this map");
        System.out.println(names.values());

    }
}

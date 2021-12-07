package collections.treemaps;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {

        System.out.println("1. Write a Java program to associate the specified value with the specified key in a Tree Map. ");
        TreeMap<Integer, String> names = new TreeMap<>();
        names.put(1, "Brian");
        names.put(3, "Mark");
        names.put(2, "Donald");
        names.put(5, "Anthony");
        names.put(4, "Brandon");
        System.out.println(names);

        System.out.println("2. Write a Java program to copy a Tree Map content to another Tree Map.");
        TreeMap<Integer, String> toCopy = new TreeMap<>();
        toCopy.putAll(names);
        System.out.println(toCopy);

        System.out.println("3. Write a Java program to search a key in a Tree Map.");
        System.out.println(names.containsKey(2));

        System.out.println("4.  Write a Java program to search a value in a Tree Map.");
        System.out.println(names.containsValue("Mark"));

        System.out.println("5. Write a Java program to get all keys from the given a Tree Map.");
        System.out.println(names.keySet());

        System.out.println("6. Write a Java program to delete all elements from a given Tree Map.");
        toCopy.clear();

        System.out.println("NOT DONE: 7. Write a Java program to sort keys in Tree Map by using comparator.");

        System.out.println("8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.");
        System.out.println(names.firstEntry());
        System.out.println(names.lastEntry());

        System.out.println("9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");
        System.out.println(names.firstKey());
        System.out.println(names.lastKey());

        System.out.println("10. Write a Java program to get a reverse order view of the keys contained in a given map.");
        System.out.println(names.descendingKeySet());

        System.out.println("11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.");
        System.out.println(names.floorEntry(2));

        System.out.println("12. Write a Java program to get the greatest key less than or equal to the given key. ");
        System.out.println(names.floorKey(2));

        System.out.println("13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.");
        System.out.println(names.headMap(3));

        System.out.println("14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.");
        System.out.println(names.headMap(3, true));

        System.out.println("15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.");
        System.out.println(names.higherEntry(2));

        System.out.println("16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.");
        System.out.println(names.lowerEntry(2));

        System.out.println("17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key. ");
        System.out.println(names.lowerKey(2));

        System.out.println("18. Write a Java program to get NavigableSet view of the keys contained in a map.");
        System.out.println(names.navigableKeySet());

        System.out.println("19. Write a Java program to remove and get a key-value mapping associated with the least key in a map. ");
        names.pollFirstEntry();

        System.out.println("20.  Write a Java program to remove and get a key-value mapping associated with the greatest key in this map. ");
        names.pollLastEntry();

        System.out.println("21.  Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive). ");
        SortedMap<Integer, String> toSub = new TreeMap<>();
        toSub = names.subMap(2, 3);

        System.out.println("22. Write a Java program to get the portion of a map whose keys range from a given key to another key.");
        names.subMap(2, true, 3, true);

        System.out.println("23.  Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");
        names.tailMap(2);

        System.out.println("24. Write a Java program to get a portion of a map whose keys are greater than to a given key.");
        names.tailMap(20, false);

        System.out.println("25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.");
        names.ceilingEntry(50);

        System.out.println("26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.");
        names.ceilingKey(50);
    }
}

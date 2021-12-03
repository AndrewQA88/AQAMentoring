package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array7 {

    public static void main(String[] args) {

        /* Write a Java program to search an element in a array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        System.out.println(names.contains("Paul"));
        System.out.println(names.indexOf("Paul"));

        String result = Array7.searchElementInList("Paul", names);
        System.out.println(result);
    }

    public static String searchElementInList(String name, List<String> names) {
        for (String element : names) {
            if (element.contains(name)) {
                return "Found: " + element;
            }
        }
        return null;
    }
}

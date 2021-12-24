package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array9 {

    public static void main(String[] args) {

        /*Write a Java program to copy one array list into another.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");
        System.out.println(names);

        List<String> names2 = names;
        System.out.println(names2);

        System.out.println(names.equals(names2));

    }
}
